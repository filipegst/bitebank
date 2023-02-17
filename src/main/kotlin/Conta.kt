abstract class Conta(var titular: String,
                 val numeroConta: Int) {
    var saldo = 0.0
        protected set

   open fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }

    }

   abstract fun saca(valor: Double)

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