package br.com.alura.bytebank.teste

fun pilha() {
    println("início main")
    funcao11()
    println("fim main")
}

fun funcao11(){
    inicio()
    println("início funcao1")
    funcao22()
    println("fim funcao1")
}

fun funcao22() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
    }
    println("fim funcao2")
}