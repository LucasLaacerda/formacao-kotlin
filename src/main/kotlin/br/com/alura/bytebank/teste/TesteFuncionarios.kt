import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testeFuncionarios() {
    val alex = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 100.00,
        senha = 1234
    )

    println("Nome ${alex.nome}")
    println("Cpf ${alex.cpf}")
    println("Salario ${alex.salario}")
    println("Bonificacao ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "111.111.111-11",
        salario = 100.00,
        senha = 1234
    )

    println("Nome ${fran.nome}")
    println("Cpf ${fran.cpf}")
    println("Salario ${fran.salario}")
    println("Bonificacao ${fran.bonificacao}")
    if (fran.autentica(1234)) {
        println("Senha correta")
    } else println("Senha incorreta")
    // testeComportamentosConta()


    val gui = Diretor(
        nome = "Gui",
        cpf = "111.111.111-11",
        salario = 14000.00,
        senha = 14000,
        plr = 200.00
    )

    println("Nome ${gui.nome}")
    println("Cpf ${gui.cpf}")
    println("Salario ${gui.salario}")
    println("plr ${gui.plr}")
    println("Bonificacao ${gui.bonificacao}")
    if (fran.autentica(14000)) {
        println("Senha correta")
    } else println("Senha incorreta")


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)

    println("Total de bonificação: ${calculadora.total}")
}
