package learner.rahulraghuwanshi.code.first_java

//Input currency in rupees and output in USD.

fun main() {
    // Input currency in rupees
    println("Enter the amount in rupees:")
    val rupees = readln().toDoubleOrNull()

    // Check if input is valid
    if (rupees != null && rupees >= 0) {
        // Assume exchange rate (1 USD = 75 INR)
        val exchangeRate = 75.0

        // Convert rupees to USD
        val usd = rupees / exchangeRate

        // Display the converted amount
        println("$rupees INR is equal to ${String.format("%.2f", usd)} USD")
    } else {
        println("Invalid input. Please enter a valid amount in rupees.")
    }
}
