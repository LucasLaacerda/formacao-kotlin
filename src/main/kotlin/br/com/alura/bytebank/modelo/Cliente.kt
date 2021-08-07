package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int):Boolean{
        if(this.senha == senha){
            return true
        }else return false
    }

}