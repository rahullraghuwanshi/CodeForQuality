package learner.rahulraghuwanshi.code.conditional_loops

//Area of a triangle can be calculated

fun main() {
    // Input the base and height of the triangle
    println("Enter the base of the triangle:")
    val base = readln().toDoubleOrNull()

    println("Enter the height of the triangle:")
    val height = readln().toDoubleOrNull()

    // Check if inputs are valid
    if (base != null && height != null && base >= 0 && height >= 0) {
        // Calculate the area of the triangle
        val area = 0.5 * base * height

        // Display the result
        println("The area of the triangle with base $base and height $height is: $area")
    } else {
        println("Invalid input. Please enter non-negative numbers for base and height.")
    }
}

//The area of a triangle can be calculated using various methods, such as by Heron's formula or by multiplying the base and height and dividing by 2.


//Explanation of the formula:
// area of triangle = half * base * height
//- The area of a triangle is given by the formula: \( A = \frac{1}{2} \times b \times h \), where \( A \) is the area, \( b \) is the base of the triangle, and \( h \) is the height of the triangle.
//- In this program, we prompt the user to input the base and height of the triangle, then we check if the inputs are valid (non-negative numbers).
//- If the inputs are valid, we calculate the area using the formula and display the result. Otherwise, we display an error message.