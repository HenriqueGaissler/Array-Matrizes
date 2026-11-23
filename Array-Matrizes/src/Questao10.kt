fun main() {
    val notas = Array(3) { DoubleArray(2) }
    notas[0] = doubleArrayOf(8.0, 7.0)
    notas[1] = doubleArrayOf(5.0, 6.0)
    notas[2] = doubleArrayOf(9.0, 8.0)

    var somaMedias = 0.0

    for (i in notas.indices) {
        val media = notas[i].average()
        somaMedias += media

        if (media >= 7.0) {
            println("Aluno ${i + 1}: Aprovado - $media")
        } else {
            println("Aluno ${i + 1}: Reprovado - $media")
        }
    }

    println("Média geral da turma: ${somaMedias / notas.size}")
}
