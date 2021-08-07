import br.com.alura.bytebank.exception.SaldoInsuficienteExecption
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testeComportamentosConta() {
    val contaAlex = ContaCorrente(Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 1234
    ), 1000)
    contaAlex.deposita(100.00)
    println(contaAlex.titular)

    val contaFran = ContaPoupanca(Cliente(
        nome = "Fran",
        cpf = "111.111.111-11",
        senha = 1234
    ), 1001)
    contaFran.deposita(100.00)
    println(contaFran.titular)

    println("Depositando")
    contaAlex.deposita(50.00)
    contaAlex.saca(20.00)
    println(contaAlex.saldo)

    println("Transferencia da conta da Fran para o Alex")
    try{
    contaFran.transfere(12345555.00, contaAlex)
        println("Tranferencia sucedida")
    } catch(e: SaldoInsuficienteExecption){
        println("Falha na tranferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}
