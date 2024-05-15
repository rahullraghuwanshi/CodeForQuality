package learner.rahulraghuwanshi.code

fun main() {
    // Input the number of terms in the Fibonacci series
    println("Enter the number of terms in the Fibonacci series:")
    val n = readln().toIntOrNull()

    // Check if input is valid
    if (n != null && n > 0) {
        // Print the Fibonacci series
        println("Fibonacci Series up to $n numbers:")
        var num1 = 0
        var num2 = 1
        var count = 2
        print("$num1 ")
        print("$num2 ")
        while (count < n) {
            val sum = num1 + num2
            print("$sum ")
            num1 = num2
            num2 = sum
            count++
        }
    } else {
        println("Invalid input. Please enter a positive integer.")
    }
}
