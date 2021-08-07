package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoExecption
import br.com.alura.bytebank.exception.SaldoInsuficienteExecption

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set
    companion object {
        var total = 0
            private set
    }
    init {
        total++
    }

    override fun autentica(senha: Int): Boolean {
       return titular.autentica(senha)
    }

//    constructor(titular:String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta){

        if(saldo < valor){
            throw SaldoInsuficienteExecption("O saldo é insuficiente")
        }

        if(!autentica(1234)){
            throw FalhaAutenticacaoExecption()
        }

            saldo -= valor
            destino.deposita(valor)

    }
}