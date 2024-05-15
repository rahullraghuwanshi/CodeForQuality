package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter a number:")
    val number = readLine()?.toIntOrNull()

    if (number != null && number > 0) {
        val isPerfect = isPerfectNumber(number)
        if (isPerfect) {
            println("$number is a perfect number.")
        } else {
            println("$number is not a perfect number.")
        }
    } else {
        println("Invalid input. Please enter a positive integer.")
    }
}

fun isPerfectNumber(number: Int): Boolean {
    var sum = 0
    for (i in 1 until number) {
        if (number % i == 0) {
            sum += i
        }
    }
    return sum == number
}
