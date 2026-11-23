fun main() {
    val numeros = IntArray(20) { it + 1 }
    var soma = 0

    for (i in 0..<numeros.size step 2) {
        soma += numeros[i]
    }

    println("Soma: $soma")
}
