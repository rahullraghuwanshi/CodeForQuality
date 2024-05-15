package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter the units consumed:")
    val units = readln().toIntOrNull()

    if (units != null && units >= 0) {
        val bill = when {
            units <= 100 -> units * 1.20
            units <= 300 -> 100 * 1.20 + (units - 100) * 2
            else -> 100 * 1.20 + 200 * 2 + (units - 300) * 3
        }
        println("Electricity Bill: $$bill")
    } else {
        println("Invalid input. Please enter a non-negative integer.")
    }
}
