fun main() {
    println("JOGO: Pedra, Papel, Tesoura, Lagarto, Spock")

    println("Insira a jogada do jogador 1:")
    val jogadaUm = readLine()?.toUpperCase() ?: return

    println("Insira a jogada do jogador 2:")
    val jogadaDois = readLine()?.toUpperCase() ?: return

    val resultado = verificarResultado(jogadaUm, jogadaDois)
    println(resultado)
}

fun verificarResultado(jogadaUm: String, jogadaDois: String): String {
    if (jogadaUm == jogadaDois) {
        return "Empate!"
    }

    return when (jogadaUm) {
        "PEDRA" -> when (jogadaDois) {
            "TESOURA", "LAGARTO" -> "Jogador 1 venceu!"
            else -> "Jogador 2 venceu!"
        }
        "PAPEL" -> when (jogadaDois) {
            "PEDRA", "SPOCK" -> "Jogador 1 venceu!"
            else -> "Jogador 2 venceu!"
        }
        "TESOURA" -> when (jogadaDois) {
            "PAPEL", "LAGARTO" -> "Jogador 1 venceu!"
            else -> "Jogador 2 venceu!"
        }
        "LAGARTO" -> when (jogadaDois) {
            "PAPEL", "SPOCK" -> "Jogador 1 venceu!"
            else -> "Jogador 2 venceu!"
        }
        "SPOCK" -> when (jogadaDois) {
            "PEDRA", "TESOURA" -> "Jogador 1 venceu!"
            else -> "Jogador 2 venceu!"
        }
        else -> "Jogada inválida!"
    }
}