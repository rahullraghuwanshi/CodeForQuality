package learner.rahulraghuwanshi.code.conditional_loops

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero. Kotlin Program:


fun main() {
    val numbers = mutableListOf<Int>()
    var input: Int
    do {
        println("Enter a number (enter 0 to terminate):")
        input = readLine()?.toIntOrNull() ?: 0
        numbers.add(input)
    } while (input != 0)

    var sumOfNegatives = 0
    var sumOfPositiveEvens = 0
    var sumOfPositiveOdds = 0

    for (number in numbers) {
        when {
            number < 0 -> sumOfNegatives += number
            number > 0 -> if (number % 2 == 0) sumOfPositiveEvens += number else sumOfPositiveOdds += number
        }
    }

    println("Sum of negative numbers: $sumOfNegatives")
    println("Sum of positive even numbers: $sumOfPositiveEvens")
    println("Sum of positive odd numbers: $sumOfPositiveOdds")
}
