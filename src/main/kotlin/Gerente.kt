class Gerente(
     nome: String,
     cpf: String,
     salario:Double,
     senha: Int
) :FuncionariosAdmin (nome = nome , cpf = cpf, salario = salario, senha = senha ) {
    override val bonificacao: Double get () = salario *0.15

}
