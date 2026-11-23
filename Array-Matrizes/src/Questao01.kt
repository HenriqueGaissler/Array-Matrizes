fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6)
    var i = 0
    var j = numeros.size - 1

    while (i < j) {
        val temp = numeros[i]
        numeros[i] = numeros[j]
        numeros[j] = temp
        i++
        j--
    }

    println(numeros.contentToString())
}
