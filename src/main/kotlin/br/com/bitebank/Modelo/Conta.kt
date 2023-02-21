package br.com.bitebank.Modelo

abstract class Conta(var titular: Cliente,
                     val numeroConta: Int) {
    var saldo = 0.0
        protected set

   open fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }

    }

   abstract fun saca(valor: Double)


}