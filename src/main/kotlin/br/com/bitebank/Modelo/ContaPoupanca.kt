package br.com.bitebank.Modelo

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
): Conta(titular = titular,
        numeroConta=numeroConta), Transferivel {
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
    override fun transfere(valor: Double, destino: Conta) {
        while (true) {
            if (saldo >= valor) {
                saldo -= valor
                destino.deposita(valor)
                break
            } else {
                println("Transferencia em excesso, tente novamente")
                transfere(valor = readln().toDouble(), destino)
                break
            }
        }
    }

}