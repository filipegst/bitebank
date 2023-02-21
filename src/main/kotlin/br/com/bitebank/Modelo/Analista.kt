package br.com.bitebank.Modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionarios(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao : Double get() = salario * 0.10


}

