import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun verificaCopiasEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(numeroX)
    println(numeroY)

    val contaJoao = ContaCorrente(Cliente(
        nome = "Joao",
        cpf = "111.111.111-11",
        senha = 1234
    ), 1002)
    var contaMaria = contaJoao
    contaMaria.titular = Cliente(nome = "Maria",cpf = "111.111.111-11",senha = 1234)

    println("titular conta joao: ${contaJoao.titular}")
}
