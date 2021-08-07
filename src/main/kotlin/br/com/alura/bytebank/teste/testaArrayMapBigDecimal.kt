package br.com.alura.bytebank.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrayMapBigDecimal() {
    val salarios = bigDecimalArrayOf("1400.55", "2000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
        .toTypedArray()



    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatorio()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        (acumulador + salario * meses).setScale(2, RoundingMode.UP)
    }

    println(gastoTotal)

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(media)
}








