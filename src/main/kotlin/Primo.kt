fun main() {
    var primo = true

    println("Insira o seu numero: ")
    val numero = readln().toUInt()

    for (i in 2u..numero - 1u){
        if ((numero % i).toInt() == 0){
            primo = false
        }
    }

    if (primo){
        println("$numero e primo")
    } else {
        println("$numero nao e primo")
    }
}