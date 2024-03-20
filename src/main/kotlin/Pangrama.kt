fun main() {
    println("Insira a sua frase")
    val frase = readln()

    val todasAsLetras = "abcdefghijklmnopqrstuvwxyz".toSet()

    val letrasUnicas = mutableSetOf<Char>()

    for (caractere in frase){
        if (caractere in 'a'..'z'){
            if (!letrasUnicas.contains(caractere)){
                letrasUnicas.add(caractere)
            }
        }
    }

    if (letrasUnicas == todasAsLetras){
        println("E um anagrama")
    } else {
        println("Nao e um anagrama")
    }
}