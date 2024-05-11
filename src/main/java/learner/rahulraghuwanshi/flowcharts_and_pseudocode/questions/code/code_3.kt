package learner.rahulraghuwanshi.flowcharts_and_pseudocode.questions.code

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the number to generate its multiplication table: ")
    val number = scanner.nextInt()

    println("Multiplication table for $number:")
    for (i in 1..10) {
        val product = number * i
        println("$number x $i = $product")
    }
}

/**

 * Input :
 * Enter the number to generate its multiplication table:
 * 3

 * Output :
 * Multiplication table for 3:
 * 3 x 1 = 3
 * 3 x 2 = 6
 * 3 x 3 = 9
 * 3 x 4 = 12
 * 3 x 5 = 15
 * 3 x 6 = 18
 * 3 x 7 = 21
 * 3 x 8 = 24
 * 3 x 9 = 27
 * 3 x 10 = 30
**/
