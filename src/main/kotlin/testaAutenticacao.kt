fun testaAutenticacao() {
    val marco = Gerente(
        nome = "Marco",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 1234,
    )
    print("Digite a senha:")

    val sistema = SistemaInterno()
    sistema.entra(marco, senha = readln().toInt())
}