fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 0, 3),
        intArrayOf(4, 5, 0),
        intArrayOf(0, 7, 8)
    )
    var soma = 0

    for (linha in matriz) {
        for (valor in linha) {
            if (valor == 0) continue
            if (valor > 0) soma += valor
        }
    }

    println("Soma dos valores positivos: $soma")
}
