package learner.rahulraghuwanshi.code.conditional_loops

import kotlin.math.pow

fun main() {
    println("Enter the base:")
    val base = readln().toDoubleOrNull()

    println("Enter the exponent:")
    val exponent = readln().toDoubleOrNull()

    if (base != null && exponent != null) {
        val result = base.pow(exponent)
        println("$base raised to the power of $exponent is: $result")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}
