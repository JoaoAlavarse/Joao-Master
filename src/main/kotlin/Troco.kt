fun main() {
    println("Informe o valor total a ser pago:")
    val valorTotal = readLine()?.toDoubleOrNull() ?: return

    println("Informe o valor efetivamente pago:")
    val valorPago = readLine()?.toDoubleOrNull() ?: return

    val troco = valorPago - valorTotal

    if (troco < 0) {
        println("O valor pago é insuficiente.")
        return
    }

    val cedulas = listOf(100.0, 50.0, 10.0, 5.0, 1.0)
    val moedas = listOf(0.5, 0.1, 0.05, 0.01)

    var trocoRestante = troco

    println("Troco a ser fornecido:")

    for (cedula in cedulas) {
        val quantidade = (trocoRestante / cedula).toInt()
        if (quantidade > 0) {
            println("$quantidade cédula(s) de R$$cedula")
            trocoRestante -= quantidade * cedula
        }
    }

    for (moeda in moedas) {
        val quantidade = (trocoRestante / moeda).toInt()
        if (quantidade > 0) {
            println("$quantidade moeda(s) de R$$moeda")
            trocoRestante -= quantidade * moeda
        }
    }
}
