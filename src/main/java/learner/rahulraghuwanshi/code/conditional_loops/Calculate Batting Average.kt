package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter the total runs scored:")
    val totalRuns = readln().toIntOrNull()

    println("Enter the total number of times dismissed:")
    val dismissals = readln().toIntOrNull()

    if (totalRuns != null && dismissals != null && totalRuns >= 0 && dismissals >= 0) {
        val battingAverage = if (dismissals != 0) totalRuns.toDouble() / dismissals else 0.0
        println("Batting Average: $battingAverage")
    } else {
        println("Invalid input. Please enter non-negative integers.")
    }
}
