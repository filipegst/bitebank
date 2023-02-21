package br.com.bitebank.Modelo

class ContaSalario(
        titular: Cliente,
    numeroConta: Int
): Conta(titular = titular,
        numeroConta=numeroConta) {
    override fun saca(valor: Double) {
        while (true) {
            if (saldo >= valor) {
                saldo -= valor
                break
            } else {
                println("saque em excesso, tente novamente")
                saca(valor = readln().toDouble())
                break
            }
        }
    }

}