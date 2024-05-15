package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter the original price of the product:")
    val originalPrice = readln().toDoubleOrNull()

    if (originalPrice != null && originalPrice > 0) {
        println("Enter the discount percentage:")
        val discountPercentage = readln().toDoubleOrNull()

        if (discountPercentage != null && discountPercentage >= 0 && discountPercentage <= 100) {
            val discountAmount = originalPrice * discountPercentage / 100
            val discountedPrice = originalPrice - discountAmount
            println("Discounted Price: $$discountedPrice")
        } else {
            println("Invalid input for discount percentage. Please enter a number between 0 and 100.")
        }
    } else {
        println("Invalid input for original price. Please enter a positive number.")
    }
}
