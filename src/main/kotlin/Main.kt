fun main(args: Array<String>) {

    var contador: Int = 0
    var contadorpar: Int = 0
    var contadorimpar: Int = 0

    while(contador < 10){
        println("Informe o número: ")
        var num = readLine()!!.toInt()

        if(num % 2 == 0){
            contadorpar++
        }else{
            contadorimpar++
        }
    }
    println("A quantidade de números pares é = $contadorpar\n" +
            "A quantidade de números ímpares é = $contadorimpar")

}