fun testaFuncionario () {
    val amanda = Analista(
        nome = "Amanda",
        cpf = "111.111.111-11",
        salario = 1500.00
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
    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 2500.00
    )
    println("Analista jr: ${amanda.nome}")
    println("CPF:${amanda.cpf}")
    println("Salario:${amanda.salario}")
    println("Bonificação:${amanda.bonificacao}")

    println()
    println("Analista:${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salario: ${maria.salario}")
    println("Bonificação:${maria.bonificacao}")

    println()
    print("Digite a senha do Gerente:")
    if (julio.autentica(senha = readln().toInt())) {
        println("##############" )
        println("senha correta")
        println("##############")
        println()
        println("Gerente: ${julio.nome}")
        println("CPF:${julio.cpf}")
        println("Salario:${julio.salario}")
        println("Bonificação:${julio.bonificacao}")
    }

    println()
    print("Digite a senha do Diretor:")
    if (diego.autentica(senha = readln().toInt())) {
        println("##############")
        println("senha correta")
        println("##############")
        println()
        println("Gerente: ${diego.nome}")
        println("CPF:${diego.cpf}")
        println("Salario:${diego.salario}")
        println("Bonificação:${diego.bonificacao}")
        println("PLR:${diego.plr}")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.calcula(amanda)
    calculadora.calcula(julio)
    calculadora.calcula(diego)
    calculadora.calcula(maria)
    println("Valor total de bonificaçoes:${calculadora.total}")
}
