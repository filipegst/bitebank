class Cliente (
    val nome: String,
    val cpf: String,
    private val senha : Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        while (true) {
            if (this.senha == senha) {
                println("senha correta")
                return true
            }
            print("senha incorreta. Tente novamente:")
            return (autentica(senha = readln().toInt()))
        }
    }
}