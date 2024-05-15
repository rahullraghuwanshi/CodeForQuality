package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter the initial value of the asset:")
    val initialValue = readln().toDoubleOrNull()

    println("Enter the rate of depreciation per year:")
    val depreciationRate = readln().toDoubleOrNull()

    println("Enter the number of years:")
    val numberOfYears = readln().toIntOrNull()

    if (initialValue != null && depreciationRate != null && numberOfYears != null && initialValue > 0 && depreciationRate >= 0 && numberOfYears > 0) {
        var currentValue = initialValue
        repeat(numberOfYears) {
            currentValue -= currentValue * depreciationRate / 100
        }
        println("Value of the asset after $numberOfYears years: $$currentValue")
    } else {
        println("Invalid input. Please enter valid values.")
    }
}
