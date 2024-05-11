package learner.rahulraghuwanshi.flowcharts_and_pseudocode.questions.code

import java.util.*

/** Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all. **/
fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0

    println("Enter numbers (type '0' to stop): ")
    while (true) {
        val input = scanner.nextInt()

        if (input == 0) {
            break
        }
        sum += input
    }

    println("Sum of all entered numbers: $sum")
}