class ContaCorrente(
    titular: String,
    numeroConta: Int
): Conta (
    titular = titular,
    numeroConta = numeroConta
)  {
    override fun saca(valor: Double) {
        while (true) {
            if (saldo >= valor + 0.5) {
                saldo -= valor +0.5
                break
            } else {
                println("saque em excesso, tente novamente")
                saca(valor = readln().toDouble())
                break
            }
        }
    }
}