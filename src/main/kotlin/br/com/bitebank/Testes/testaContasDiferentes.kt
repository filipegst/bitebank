package br.com.bitebank.Testes

import br.com.bitebank.Modelo.Cliente
import br.com.bitebank.Modelo.ContaCorrente
import br.com.bitebank.Modelo.ContaPoupanca
import br.com.bitebank.Modelo.Endereco

fun testaContasDiferentes() {


    val junior = ContaCorrente(titular = Cliente(nome = "Junior", cpf = "22", senha = 321, endereco = Endereco("Murilo de sena", numerodoendereco = 42)), numeroConta = 1001)
    val miriam = ContaPoupanca(titular = Cliente(nome = "Miriam", cpf = "2323",senha = 456), numeroConta = 1002)

    println(miriam.titular.nome)
    println(miriam.saldo)
    miriam.deposita(600.00)
    println(miriam.saldo)
    miriam.saca(200.00)
    println(miriam.saldo)

    println()

    println(junior.titular.nome)
    println(junior.titular.endereco.rua)
    println(junior.saldo)
    junior.deposita(1000.00)
    println(junior.saldo)
    junior.saca(200.00)
    println(junior.saldo)
}
