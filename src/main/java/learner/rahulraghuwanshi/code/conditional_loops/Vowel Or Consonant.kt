package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter a character:")
    val char = readLine()?.get(0)

    if (char != null) {
        if (char.isLetter()) {
            val result = if (char.isVowel()) "vowel" else "consonant"
            println("$char is a $result.")
        } else {
            println("Invalid input. Please enter a valid alphabetic character.")
        }
    } else {
        println("Invalid input. Please enter a character.")
    }
}

fun Char.isVowel(): Boolean {
    val lowerCaseChar = this.toLowerCase()
    return lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u'
}
