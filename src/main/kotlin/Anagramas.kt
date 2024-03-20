fun main() {
    println("Insira a primeira frase")
    val fraseUm = readln()

    println("Insira a segunda frase")
    val fraseDois = readln()

    var stringUm = fraseUm.replace("\\s+".toRegex(), "").lowercase()
    var stringDois = fraseDois.replace("\\s+".toRegex(), "").lowercase()

    val mapUm = mutableMapOf<Char, Int>()
    val mapDois = mutableMapOf<Char, Int>()

    for (char in stringUm){
        mapUm[char] = mapUm.getOrDefault(char, 0) + 1
    }

    for (char in stringDois){
        mapDois[char] = mapDois.getOrDefault(char, 0) + 1
    }

    if (mapUm == mapDois){
        println("Sao anagramas")
    } else {
        println("Nao sao anagramas")
    }
}