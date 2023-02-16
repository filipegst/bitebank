fun main() {
    val amanda = Funcionarios(
        nome = "Amanda",
        cpf = "111.111.111-11",
        salario = 1000.00
    )
    val julio = Gerente(
        nome = "Julio",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 1234
    )
    val diego = Diretor(
        nome = "Diego",
        cpf = "333.333.333-33",
        salario = 3000.00,
        senha = 9876,
        plr = 300.00
    )

    println("Funcionario: ${amanda.nome}")
    println("CPF:${amanda.cpf}")
    println("Salario:${amanda.salario}")
    println("Bonificação:${amanda.bonificacao}")

    println()
    print("Digite a senha do Gerente:")
    if (julio.autentica(senha = readln().toInt())) {
        println("senha correta")
        println("Gerente: ${julio.nome}")
        println("CPF:${julio.cpf}")
        println("Salario:${julio.salario}")
        println("Bonificação:${julio.bonificacao}")
    }

    println()
    print("Digite a senha do Diretor:")
    if (diego.autentica(senha = readln().toInt())) {
        println("senha correta")
        println("Gerente: ${diego.nome}")
        println("CPF:${diego.cpf}")
        println("Salario:${diego.salario}")
        println("Bonificação:${diego.bonificacao}")
        println("PLR:${diego.plr}")
    }
}


