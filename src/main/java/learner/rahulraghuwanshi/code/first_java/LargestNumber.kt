package learner.rahulraghuwanshi.code.first_java

//Take 2 numbers as input and print the largest number.

fun main() {
    // Input first number
    println("Enter the first number:")
    val num1 = readln().toDoubleOrNull()

    // Input second number
    println("Enter the second number:")
    val num2 = readln().toDoubleOrNull()

    // Check if both inputs are valid
    if (num1 != null && num2 != null) {
        // Find the largest number
        val largestNumber = if (num1 > num2) {
            num1
        } else {
            num2
        }

        // Display the largest number
        println("The largest number is: $largestNumber")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}
