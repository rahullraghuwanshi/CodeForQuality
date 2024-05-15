package learner.rahulraghuwanshi.code

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

fun main() {
    // Input first number
    println("Enter the first number:")
    val num1 = readln().toDoubleOrNull()

    // Input operator
    println("Enter the operator (+, -, *, /):")
    val operator = readln().toString()

    // Input second number
    println("Enter the second number:")
    val num2 = readln().toDoubleOrNull()

    // Check if all inputs are valid
    if (num1 != null && num2 != null) {
        // Calculate result based on the operator
        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0.0) {
                    num1 / num2
                } else {
                    println("Error: Division by zero")
                    return
                }
            }
            else -> {
                println("Error: Invalid operator")
                return
            }
        }

        // Display the result
        println("Result: $result")
    } else {
        println("Invalid input. Please enter valid numbers and operator.")
    }
}
