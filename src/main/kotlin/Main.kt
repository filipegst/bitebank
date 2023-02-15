

fun main() {
    println("Bem vindo ao ByteBank !");
    val contaFilipe = Conta()
    contaFilipe.titular = "Filipe"
    contaFilipe.numeroConta = 1000
    contaFilipe.saldo = 1888.00
    println("Titular :"+ contaFilipe.titular)
    println("Conta numero: ${ contaFilipe.numeroConta}")
    println("seu saldo é R$: " + contaFilipe.saldo)
   println()
    val contaYasmin = Conta()
    contaYasmin.titular = "Yasmin"
    contaYasmin.numeroConta = 1001
    contaYasmin.saldo = 1320.00
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

}

class Conta {
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
    fun deposita(valor: Double) {
        saldo += valor

    }
    fun saca (valor: Double) {
        while (true){
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
