package learner.rahulraghuwanshi.flowcharts_and_pseudocode.questions.code

import java.util.*

/** Take 2 numbers as inputs and find their HCF and LCM. **/
import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val scanner = Scanner(System.`in`)

    // Input the first number
    println("Enter the first number: ")
    val num1 = scanner.nextInt()

    // Input the second number
    println("Enter the second number: ")
    val num2 = scanner.nextInt()

    // Ensure tempNum1 holds the greater value
    var tempNum1 = max(num1,num2)
    var tempNum2 = min(num1,num2)

    // Calculate HCF using the Euclidean algorithm
    var gcd = 1
    while (tempNum2 != 0) {
        val remainder = tempNum1 % tempNum2
        tempNum1 = tempNum2
        tempNum2 = remainder
    }
    gcd = tempNum1

    // Calculate LCM using the formula LCM = (num1 * num2) / HCF
    val lcm = (num1 * num2) / gcd

    // Output the results
    println("HCF of $num1 and $num2 is: $gcd")
    println("LCM of $num1 and $num2 is: $lcm")
}
