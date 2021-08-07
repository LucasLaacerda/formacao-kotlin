package br.com.alura.bytebank.list

import br.com.alura.bytebank.modelo.Livro

fun main(){
    val livro1 = Livro(
        titulo = "Grande Sertão Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 2022
    )
    val livrosComNull: List<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
    //println(livrosComNull)

    livrosComNull
        .groupBy { it.editora ?:"Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("\n$editora: ${livros.joinToString { it.titulo ?: "Titulo desconhecido" }}")
        }
}