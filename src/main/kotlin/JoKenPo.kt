fun main() {
    println("JOGADAS: PEDRA | PAPEL | TESOURA")

    println("Insira a jogada do jogador 1")
    val jogadaUm = readLine()?.uppercase()

    println("Insira a jogada do jogador 2")
    val jogadaDois = readLine()?.uppercase()

    if (jogadaUm == jogadaDois) {
        println("EMPATE")
    } else if (
        (jogadaUm == "PEDRA" && jogadaDois == "TESOURA") ||
        (jogadaUm == "TESOURA" && jogadaDois == "PAPEL") ||
        (jogadaUm == "PAPEL" && jogadaDois == "PEDRA")
    ) {
        println("Vitória de $jogadaUm")
    } else if (
        (jogadaUm == "TESOURA" && jogadaDois == "PEDRA") ||
        (jogadaUm == "PAPEL" && jogadaDois == "TESOURA") ||
        (jogadaUm == "PEDRA" && jogadaDois == "PAPEL")
    ) {
        println("Vitória de $jogadaDois")
    } else {
        println("Entrada inválida")
    }
}