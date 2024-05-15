package learner.rahulraghuwanshi.code.conditional_loops

//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August. Kotlin Program:

fun main() {
    val month = "August"
    val daysInAugust = 31

    var count = 0
    for (day in 1..daysInAugust) {
        if (day % 2 == 0) {
            count++
        }
    }

    println("Kunal can go out on $count days in the month of $month.")
}


