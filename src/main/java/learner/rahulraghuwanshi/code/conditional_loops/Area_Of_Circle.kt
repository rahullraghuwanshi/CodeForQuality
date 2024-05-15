package learner.rahulraghuwanshi.code.conditional_loops

//Calculate the area of a circle

import kotlin.math.PI

fun main() {
    // Input the radius of the circle
    println("Enter the radius of the circle:")
    val radius = readln().toDoubleOrNull()

    // Check if input is valid
    if (radius != null && radius >= 0) {
        // Calculate the area of the circle
        val area = PI * radius * radius

        // Display the result
        println("The area of the circle with radius $radius is: $area")
    } else {
        println("Invalid input. Please enter a non-negative number.")
    }
}

//Explanation :
//- The area of a circle is given by the formula: \( A = \pi \times r^2 \), where \( A \) is the area, \( \pi \) (pi) is a mathematical constant approximately equal to 3.14159, and \( r \) is the radius of the circle.
//- In this program, we use the `PI` constant provided by Kotlin's standard library to represent the value of \( \pi \).
//- We prompt the user to input the radius of the circle, then we check if the input is valid (non-negative number).
//- If the input is valid, we calculate the area using the formula and display the result. Otherwise, we display an error message.