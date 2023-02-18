class Diretor(
     nome: String,
     cpf: String,
     salario:Double,
     senha: Int,
     val plr: Double
) :FuncionariosAdmin (nome = nome , cpf = cpf, salario = salario, senha = senha ),Autenticavel {

    override val bonificacao: Double get () = salario *0.25
}
