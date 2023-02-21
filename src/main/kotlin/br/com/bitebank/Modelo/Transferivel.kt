package br.com.bitebank.Modelo

interface Transferivel {

    fun transfere(valor: Double, destino: Conta) {
    }
}