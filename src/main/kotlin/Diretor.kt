class Diretor(
     nome: String,
     cpf: String,
     salario:Double,
    val senha: Int,
     val plr: Double
) :Funcionarios (nome = nome , cpf = cpf, salario = salario, ) {

    override val bonificacao: Double get () = salario *0.25

    fun autentica(senha: Int): Boolean {
        while (true) {
            if (this.senha == senha) {
                return true
            }
            print("senha incorreta. Tente novamente:")
            return (autentica(senha = readln().toInt()))
        }
    }


}
