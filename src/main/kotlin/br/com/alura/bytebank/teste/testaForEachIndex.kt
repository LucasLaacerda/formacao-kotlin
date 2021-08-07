package br.com.alura.bytebank.teste

fun testaForEachIndex() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 1000.0)

    val aumento = 1.1
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}
