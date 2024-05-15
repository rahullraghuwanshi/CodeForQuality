package learner.rahulraghuwanshi.code.first_java

fun main() {
    // Input the string
    println("Enter a string:")
    val inputString = readln()

    // Check if the input string is null or empty
    if (inputString.isEmpty()) {
        println("Invalid input. Please enter a non-empty string.")
        return
    }

    // Remove white spaces and convert to lowercase for case-insensitive comparison
    val formattedString = inputString.toLowerCase().replace("\\s".toRegex(), "")

    // Check if the string is a palindrome
    val isPalindrome = formattedString == formattedString.reversed()

    // Print the result
    if (isPalindrome) {
        println("$inputString is a palindrome.")
    } else {
        println("$inputString is not a palindrome.")
    }
}
