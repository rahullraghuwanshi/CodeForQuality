package learner.rahulraghuwanshi.code

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

fun main() {
    // Input principal, time, and rate from the user
    println("Enter principal amount:")
    val principal = readln().toDoubleOrNull()

    println("Enter time (in years):")
    val time = readln().toDoubleOrNull()

    println("Enter rate of interest:")
    val rate = readln().toDoubleOrNull()

    // Check if all inputs are valid
    if (principal != null && time != null && rate != null) {
        // Calculate simple interest
        val simpleInterest = (principal * time * rate) / 100

        // Display the result
        println("Simple Interest: $simpleInterest")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}
