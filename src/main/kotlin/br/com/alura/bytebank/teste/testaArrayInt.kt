package br.com.alura.bytebank.teste

fun testaArrayInt() {
    val idades: IntArray = intArrayOf(15, 19, 33, 44)

    var maiorIdade = Int.MIN_VALUE
    idades.forEach { idade ->
        if (idade > maiorIdade)
            maiorIdade = idade
    }
    println(maiorIdade)
}
