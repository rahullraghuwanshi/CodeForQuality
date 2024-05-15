package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter the number of elements:")
    val n = readln().toIntOrNull()

    if (n != null && n > 0) {
        var sum = 0.0
        repeat(n) {
            println("Enter number ${it + 1}:")
            sum += readln().toDoubleOrNull() ?: 0.0
        }
        val average = sum / n
        println("Average: $average")
    } else {
        println("Invalid input. Please enter a positive integer.")
    }
}
