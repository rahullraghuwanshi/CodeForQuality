package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter a year:")
    val year = readLine()?.toIntOrNull()

    if (year != null) {
        val isLeapYear = if (year % 4 == 0) {
            if (year % 100 == 0) {
                year % 400 == 0
            } else {
                true
            }
        } else {
            false
        }

        if (isLeapYear) {
            println("$year is a leap year.")
        } else {
            println("$year is not a leap year.")
        }
    } else {
        println("Invalid input. Please enter a valid year.")
    }
}
