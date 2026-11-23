fun main() {
    val temperaturas = doubleArrayOf(28.0, 30.0, 27.0, 32.0, 29.0, 31.0, 26.0)
    val media = temperaturas.average()

    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("Dia ${i + 1}: ${temperaturas[i]}")
        }
    }

    println("Média: $media")
}
