fun main() {
    println("Bem vindo ao ByteBank !");
    val contaFilipe = Conta(  "Filipe",1000)
    contaFilipe.deposita(1888.00)
    println("Titular :" + contaFilipe.titular)
    println("Conta numero: ${contaFilipe.numeroConta}")
    println("seu saldo é R$: " + contaFilipe.saldo)
    println()
    val contaYasmin = Conta("Yasmin",1001)
    contaYasmin.deposita(1320.0)
    println("Titular :" + contaYasmin.titular)
    println("Conta numero: " + contaYasmin.numeroConta)
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

class Conta(var titular: String,
            var numeroConta: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }

    }

    fun saca(valor: Double) {
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

    fun transfere(valor: Double, destino: Conta) {
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


//    while (saldo < 10.0) {
//        println(saldo)
//        saldo +  1
//        if (saldo == 3.0) {
//            continue
//        }
//    }

//fun testaCondicoes (saldo: Double){
//    if (saldo > 0.0){
//        println("conta possitiva")
//    } else if (saldo == 0.0){
//        println("conta neutra")
//    } else {
//        println("conta negativa")
//    }
//}


//for (i in 1..5){
//    saldo += 100.0
//    saldo += 200.0
//    println(saldo)
//    println(i)
//}


// Como receber inputs de numeros

//     var nomeDaVariavel = readln().toInt()
//                        = readln().toDouble()
