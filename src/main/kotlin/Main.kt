fun main (){
    println ("Bem vindo ao ByteBank !");
    val  titular = "Filipe"
    val numeroConta = 1010
    var saldo = 0.0
    saldo = 100.0
    saldo += 200.0

    println("Titular: $titular" )
    println("Numero da conta: $numeroConta")
    println("Saldo R$: $saldo")

    if (saldo > 0.0){
        println("conta possitiva")
    } else if (saldo == 0.0){
        println("conta neutra")
    } else {
        println("conta negativa")
    }
}