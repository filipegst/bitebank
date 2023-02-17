abstract class FuncionariosAdmin(
     nome: String,
     cpf: String,
     salario: Double,
    val senha: Int
):Funcionarios(nome = nome, cpf = cpf, salario = salario) {
    fun autentica (senha: Int): Boolean {
        while (true) {
            if (this.senha == senha) {
                return true
            }
            print("senha incorreta. Tente novamente:")
            return (autentica(senha = readln().toInt()))
        }
    }
}