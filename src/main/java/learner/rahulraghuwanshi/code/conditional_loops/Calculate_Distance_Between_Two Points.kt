package learner.rahulraghuwanshi.code.conditional_loops

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println("Enter the coordinates of the first point (x1 y1):")
    val x1= readln().toDoubleOrNull()
    val y1 = readln().toDoubleOrNull()

    println("Enter the coordinates of the second point (x2 y2):")
    val x2= readln().toDoubleOrNull()
    val y2 = readln().toDoubleOrNull()

    if (x1 != null && y1 != null && x2 != null && y2 != null) {
        val distance = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
        println("Distance between the two points: $distance")
    } else {
        println("Invalid input. Please enter valid coordinates.")
    }
}
