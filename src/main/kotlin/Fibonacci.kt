fun main() {
    val array = ArrayList<Int>()
    println("Insira o valor desejado")
    val valorMaximo = readln().toInt()
    var valorAtual = 1
    var prev = 0


    while (valorAtual <= valorMaximo) {
        array.add(valorAtual)
        val novoValor = valorAtual + prev
        prev = valorAtual
        valorAtual = novoValor
    }

    println("Sequência de Fibonacci até o valor máximo de $valorMaximo:")
    println(array.joinToString(", "))
}