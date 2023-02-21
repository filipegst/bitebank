package br.com.bitebank.Modelo

abstract class Funcionarios(
    val nome: String,
    val cpf: String,
    var salario: Double

) {
    abstract val bonificacao: Double
}