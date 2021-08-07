package br.com.alura.bytebank.teste

fun testaRange() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        println("$s")
    }

    val numerosPares = 0..100 step 2
    for (n in numerosPares) {
        println("$n")
    }

    val numerosParesReversos = 10 downTo 0 step 2
    numerosParesReversos.forEach { print("$it ") }


    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Esta dentro do intervalo")
    }


    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}
