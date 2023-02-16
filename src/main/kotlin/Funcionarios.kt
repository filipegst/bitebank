open class Funcionarios(
    val nome: String,
    val cpf: String,
    var salario: Double

) {
    open val bonificacao: Double get () = salario *0.1
}