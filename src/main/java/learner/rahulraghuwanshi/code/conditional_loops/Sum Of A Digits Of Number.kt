package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter a number:")
    val number = readLine()?.toIntOrNull()

    if (number != null && number >= 0) {
        val sum = sumOfDigits(number)
        println("Sum of digits of $number is: $sum")
    } else {
        println("Invalid input. Please enter a non-negative integer.")
    }
}

fun sumOfDigits(number: Int): Int {
    var num = number
    var sum = 0
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}
