package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter the total sales:")
    val sales = readln().toDoubleOrNull()

    if (sales != null && sales >= 0) {
        val commissionPercentage = when {
            sales >= 10000 -> 20
            sales >= 5000 -> 15
            sales >= 1000 -> 10
            else -> 0
        }
        val commission = sales * commissionPercentage / 100
        println("Commission Percentage: $commissionPercentage%")
        println("Commission: $$commission")
    } else {
        println("Invalid input for total sales. Please enter a non-negative number.")
    }
}
