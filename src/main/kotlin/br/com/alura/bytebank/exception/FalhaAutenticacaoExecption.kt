package br.com.alura.bytebank.exception

import java.lang.Exception

class FalhaAutenticacaoExecption(
    mensagem: String = "Falah na autenticacao"
) : Exception(mensagem) {

}