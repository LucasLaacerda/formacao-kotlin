package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco()
    val enderecoNovo = Endereco()
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())


    //imprime(endereco)
}


fun imprime(valor: Any):Any{
    println(valor)
    return valor
}