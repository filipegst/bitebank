package br.com.bitebank.Testes

import br.com.bitebank.Modelo.Cliente
import br.com.bitebank.Modelo.ContaCorrente
import br.com.bitebank.Modelo.ContaPoupanca

fun testaComportamentoConta() {
    println("Bem vindo ao ByteBank !");
    val clienteFilipe = Cliente (nome = "Filipe", cpf = "", senha = 1)
    val contaFilipe = ContaCorrente(clienteFilipe, 1000)
    contaFilipe.deposita(1888.00)
    println("Titular :" + contaFilipe.titular)
    println("Modelo.Conta numero: ${contaFilipe.numeroConta}")
    println("seu saldo é R$: " + contaFilipe.saldo)
    println()

    val clienteYasmin = Cliente (nome = "Yasmin", cpf = "1", senha = 22)

    val contaYasmin = ContaPoupanca(clienteYasmin, 1001)
    contaYasmin.deposita(1320.0)
    println("Titular :" + contaYasmin.titular)
    println("Modelo.Conta numero: " + contaYasmin.numeroConta)
    println("seu saldo é R$" + contaYasmin.saldo)

    println()
    println("Depositando na conta da Yasmin")
    print("valor a depositar:")
    contaYasmin.deposita(valor = readln().toDouble())
    println("seu saldo é R$ ${contaYasmin.saldo}")

    println()
    println("Depositando na conta do Filipe")
    print("valor a depositar:")
    contaFilipe.deposita(valor = readln().toDouble())
    println("seu saldo é R$ ${contaFilipe.saldo}")

    println()
    println("Sacando na conta do Filipe")
    print("valor a Sacar:")
    contaFilipe.saca(valor = readln().toDouble())
    println("seu saldo é de R$ ${contaFilipe.saldo}")

    println()
    println("Transferindo na conta do Filipe")
    print("Valor a transferir:")
    contaFilipe.transfere(valor = readln().toDouble(), contaYasmin)
    println("O saldo do Filipe é de :${contaFilipe.saldo}")
    println("O saldo da Yasmin é de : ${contaYasmin.saldo}")
}

// Como receber inputs de numeros

//     var nomeDaVariavel = readln().toInt()
//                        = readln().toDouble()
