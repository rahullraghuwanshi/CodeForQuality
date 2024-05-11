package learner.rahulraghuwanshi.flowcharts_and_pseudocode.questions.code

import kotlin.time.measureTime

/**Input a year and find whether it is a leap year or not **/

// Solution 1 :
fun main()  {
    println("Enter a valid year: ")
    val year = readln().toInt()

    val totalTimeTaken = measureTime{
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    println("$year is a leap year")
                } else {
                    println("$year is not a leap year")
                }
            } else {
                println("$year is a leap year")
            }
        } else {
            println("$year is not a leap year")
        }
    }

    println("Total time taken by program : $totalTimeTaken")
}

// Solution 2 :
/*fun main() {
    println("Enter a valid year: ")
    val year = readln().toInt()

    val totalTimeTaken = measureTime{
        val isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0

        println(if (isLeapYear) "$year is a leap year." else "$year is not a leap year.")
    }
    println("Total time taken by program : $totalTimeTaken")
}*/