fun main() {
    println("Insira o seu algarismo romano")
    val algarismo = readln()

    val map = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado = 0
    var prev = 0

    for (i in algarismo.length - 1 downTo 0){
        val valorAtual = map[algarismo[i]] ?: 0
        if (valorAtual < prev){
            resultado -= valorAtual
        } else{
            resultado += valorAtual
        }
        prev = valorAtual
    }

    println("$algarismo em valor numerico e igual a: $resultado")
}