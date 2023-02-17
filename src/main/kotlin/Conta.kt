open class Conta(var titular: String,
                 val numeroConta: Int) {
    var saldo = 0.0
        private set

   open fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }

    }

   open fun saca(valor: Double) {
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

   open fun transfere(valor: Double, destino: Conta) {
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