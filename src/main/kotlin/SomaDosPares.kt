
fun main() {
    val array = ArrayList<Int>()
    var resultado = 0
    do {
        println("Insira um numero")
        array.add(readln().toInt())
    } while (continuar())

    for (num in array){
        resultado += num
    }

    val media = resultado.toDouble() / array.size
    println(media)
}

fun continuar(): Boolean{
    println("Deseja continuar? (S/N)")
    val resposta = readln().uppercase()
    if (resposta  == "N"){
        return false
    }
    return true
}