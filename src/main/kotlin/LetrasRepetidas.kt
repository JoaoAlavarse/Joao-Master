fun main() {
    println("Insira a frase")
    val frase = readLine() ?: ""

    val map = mutableMapOf<Char, Int>()

    for (letra in frase){
        map[letra] = map.getOrDefault(letra, 0) + 1
    }

    for (letra in frase){
        if (map[letra]!! > 1){
            println("Primeira letra repetida: $letra")
            return
        }
    }
    println("Não existem letras repetidas")
}