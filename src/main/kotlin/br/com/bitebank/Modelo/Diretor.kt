package br.com.bitebank.Modelo

class Diretor(
     nome: String,
     cpf: String,
     salario:Double,
     senha: Int,
     val plr: Double
) : FuncionariosAdmin(nome = nome , cpf = cpf, salario = salario, senha = senha ) {

    override val bonificacao: Double get () = salario *0.25
}
