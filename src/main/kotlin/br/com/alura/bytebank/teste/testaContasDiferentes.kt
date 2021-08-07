import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testeContasDiferentes() {
    val contaCorrente = ContaCorrente(
        Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1234,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )
        ),
        1000
    )
    val contaPoupanca = ContaPoupanca(
        Cliente(nome = "Fran",cpf = "111.111.111-11",senha = 1234),
        1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo apos saque corrente: ${contaCorrente.saldo}")
    println("Saldo apos saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)

    println("Saldo apos transferencia corrente: ${contaCorrente.saldo}")
    println("Saldo apos transferencia poupança: ${contaPoupanca.saldo}")
    println("Endereço: ${contaPoupanca.titular.endereco}")

}
