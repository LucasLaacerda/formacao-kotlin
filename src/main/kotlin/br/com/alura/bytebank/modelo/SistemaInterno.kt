package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, function: () -> Unit){
        if(admin.autentica(senha))
            println("Bem vindo ao ByteBank")
        else{
            println("Erro ao autenticar")
        }
    }


}