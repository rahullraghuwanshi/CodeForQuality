package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter a number:")
    val n = readln().toIntOrNull()

    if (n != null && n >= 0) {
        var factorial = 1
        for (i in 1..n) {
            factorial *= i
        }
        println("Factorial of $n is: $factorial")
    } else {
        println("Invalid input. Please enter a non-negative integer.")
    }
}
