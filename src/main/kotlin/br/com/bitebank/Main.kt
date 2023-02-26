package br.com.bitebank


import br.com.bitebank.Modelo.Endereco
import br.com.bitebank.Testes.testaComportamentoConta


fun main() {
    var enderecoNulo: Endereco? = Endereco("rua nelo de melo", cidade = "rio de maneiro")
    val ruaNova: String? = enderecoNulo?.rua
    println(enderecoNulo?.rua)
    enderecoNulo?.let {
        println(it.rua.length)
        val tamanho : Int = it.cidade?.length?: throw IllegalStateException ("cidade não pode ser nulo")
        println(tamanho)
    }

}





