package learner.rahulraghuwanshi.code.conditional_loops

import kotlin.math.pow

fun main() {
    println("Enter the principal amount:")
    val principal = readLine()?.toDoubleOrNull()

    println("Enter the annual interest rate (in percentage):")
    val annualRate = readLine()?.toDoubleOrNull()

    println("Enter the number of years:")
    val years = readLine()?.toIntOrNull()

    if (principal != null && annualRate != null && years != null && principal > 0 && annualRate > 0 && years > 0) {
        val rate = annualRate / 100
        val futureValue = principal * (1 + rate).pow(years)
        println("Future Investment Value: $$futureValue")
    } else {
        println("Invalid input. Please enter valid values.")
    }
}
