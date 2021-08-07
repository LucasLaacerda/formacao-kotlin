fun testeLacos() {
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }

    var i = 0
    while (i < 5) {
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        testaCondicoes(saldo)
        println()
        i++
    }

    for (i in 5 downTo 1) { //step
        //var -> mutavel
        //val -> imutavel
        if (i == 4) {
            continue
        }
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        testaCondicoes(saldo)
        println()
    }
}
