package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter the first number:")
    val num1 = readLine()?.toIntOrNull()

    println("Enter the second number:")
    val num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null) {
        val lcm = calculateLCM(num1, num2)
        println("LCM of $num1 and $num2 is: $lcm")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}

fun calculateLCM(num1: Int, num2: Int): Int {
    return (num1 * num2) / calculateHCF(num1, num2)
}

fun calculateHCF(num1: Int, num2: Int): Int {
    var a = num1
    var b = num2
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    return a
}
