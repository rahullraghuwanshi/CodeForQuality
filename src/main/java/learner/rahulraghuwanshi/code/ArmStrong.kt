package learner.rahulraghuwanshi.code

import kotlin.math.pow

fun main() {
    // Input the range
    println("Enter the range (two numbers separated by space):")
    val input = readln().split(" ")

    // Check if input is valid
    if (input.size == 2) {
        val start = input[0].toIntOrNull()
        val end = input[1].toIntOrNull()

        if (start != null && end != null && start <= end) {
            println("Armstrong numbers between $start and $end:")
            for (number in start..end) {
                if (isArmstrong(number)) {
                    println(number)
                }
            }
        } else {
            println("Invalid range. Please enter two valid integers.")
        }
    } else {
        println("Invalid input. Please enter two numbers separated by space.")
    }
}

fun isArmstrong(number: Int): Boolean {
    var num = number
    val numOfDigits = num.toString().length
    var sum = 0

    while (num > 0) {
        val digit = num % 10
        sum += digit.toDouble().pow(numOfDigits.toDouble()).toInt()
        num /= 10
    }

    return sum == number
}
