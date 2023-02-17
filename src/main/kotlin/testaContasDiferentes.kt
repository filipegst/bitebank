fun testaContasDiferentes() {
    val junior = ContaCorrente(titular = "Junior", numeroConta = 1001)
    val miriam = ContaPoupanca(titular = "Miriam", numeroConta = 1002)

    println(miriam.saldo)
    miriam.deposita(600.00)
    println(miriam.saldo)
    miriam.saca(200.00)
    println(miriam.saldo)

    println()

    println(junior.saldo)
    junior.deposita(1000.00)
    println(junior.saldo)
    junior.saca(200.00)
    println(junior.saldo)
}
