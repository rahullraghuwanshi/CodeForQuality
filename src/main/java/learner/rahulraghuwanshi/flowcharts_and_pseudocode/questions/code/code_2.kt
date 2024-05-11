package learner.rahulraghuwanshi.flowcharts_and_pseudocode.questions.code

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the first number: ")
    val num1 = scanner.nextInt()

    println("Enter the second number: ")
    val num2 = scanner.nextInt()

    val sum = num1 + num2
    println("The sum of $num1 and $num2 is: $sum")
}

/**
 * Input:
 * Enter the first number:
 * 2
 * Enter the second number:
 * 2

 * Output:
 * The sum of 2 and 2 is: 4
**/
