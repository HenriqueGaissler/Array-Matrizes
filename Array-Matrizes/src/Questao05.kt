fun main() {
    val tarefas = arrayOf("Estudar", "Ler", "Programar", "Treinar")

    for ((i, tarefa) in tarefas.withIndex()) {
        println("${i + 1} - $tarefa")
    }
}
