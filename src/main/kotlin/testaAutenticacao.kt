fun testaAutenticacao() {
    val marco = Gerente(
        nome = "Marco",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 1234,
    )
    val julia = Cliente (nome = "Julia",
        cpf = "123.456.789-00",
        senha = 5678)

    print("Digite a senha:")

    val sistema = SistemaInterno()
    sistema.entra(marco, senha = readln().toInt())
    julia.autentica(senha = readln().toInt())
}