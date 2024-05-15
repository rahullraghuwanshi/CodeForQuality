package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter a string:")
    val inputString = readLine()

    if (!inputString.isNullOrEmpty()) {
        val reversedString = inputString.reversed()
        println("Reversed string: $reversedString")
    } else {
        println("Invalid input. Please enter a non-empty string.")
    }
}
