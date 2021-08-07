package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaSafe() {
    var endereco: Endereco = Endereco(logradouro = "rua vergueiro")
    println(endereco?.logradouro)
}