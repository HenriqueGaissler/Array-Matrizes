fun main() {
    val codigos = arrayOf("A10", "B20", "C30", "D40", "E50")
    val busca = "C30"

    for (i in codigos.indices) {
        if (codigos[i] == busca) {
            println("Encontrado na posição $i")
            break
        }
    }
}
