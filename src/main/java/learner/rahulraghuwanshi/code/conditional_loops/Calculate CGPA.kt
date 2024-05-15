package learner.rahulraghuwanshi.code.conditional_loops

fun main() {
    println("Enter the number of subjects:")
    val numSubjects = readln().toIntOrNull()

    if (numSubjects != null && numSubjects > 0) {
        var totalCredits = 0
        var totalGradePoints = 0.0
        repeat(numSubjects) {
            println("Enter the credits for subject ${it + 1}:")
            val credits = readln().toIntOrNull()
            println("Enter the grade points for subject ${it + 1}:")
            val gradePoints = readln().toDoubleOrNull()
            if (credits != null && gradePoints != null && credits > 0) {
                totalCredits += credits
                totalGradePoints += credits * gradePoints
            } else {
                println("Invalid input for credits or grade points. Please enter valid values.")
                return
            }
        }
        val cgpa = totalGradePoints / totalCredits
        println("CGPA: $cgpa")
    } else {
        println("Invalid input. Please enter a positive integer for the number of subjects.")
    }
}
