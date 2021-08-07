import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testeAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Lucas",
        cpf = "111.111.111-11",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234) {
        println("realizar pagamento")
    }
    sistema.entra(diretor, 1234) {
        println("realizar pagamento")
    }
    sistema.entra(cliente, 1234) {
        println("realizar pagamento")
    }
}
