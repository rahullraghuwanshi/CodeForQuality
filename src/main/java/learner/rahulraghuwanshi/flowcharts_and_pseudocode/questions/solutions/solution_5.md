# Continuous Number Input and Sum Calculator

#### Problem Statement

Keep taking numbers as inputs until the user enters 'x', after that print the sum of all entered numbers.

#### Solution and Explanation

To solve this problem, we'll continuously take numbers as inputs from the user until they enter 'x'. After the user enters 'x', we'll calculate the sum of all entered numbers and print it.

## Flowchart

```
Start
|
|--- Initialize sum = 0
|
|--- Prompt: "Enter numbers (type 'x' to stop): "
|       |
|       Loop:
|       |
|       |--- Take input from user
|       |       |
|       |       Is input equal to 'x'?
|       |           |
|       |           Yes: End Loop
|       |           |
|       |           No: Convert input to integer
|       |               |
|       |               Is input a valid number?
|       |                   |
|       |                   Yes: Add input to sum
|       |                   |
|       |                   No: Display error message
|       |
|--- Print: "Sum of all entered numbers: $sum"
|
End
```

The flowchart outlines the steps involved in continuously taking numbers as inputs until the user enters 'x' and then printing the sum of all entered numbers.

## Kotlin Code

```kotlin
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0

    println("Enter numbers (type 'x' to stop): ")
    while (true) {
        val input = scanner.next()

        if (input == "x") {
            break
        }

        try {
            val number = input.toInt()
            sum += number
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid number or 'x' to stop.")
        }
    }

    println("Sum of all entered numbers: $sum")
}
```

[Run above kotlin code](https://github.com/rahullraghuwanshi/CodeForQuality/blob/main/src/main/java/learner/rahulraghuwanshi/flowcharts_and_pseudocode/questions/code/code_5.kt)

The Kotlin code dynamically takes numbers as inputs until the user enters 'x', calculates the sum of all entered numbers, and then prints the result.
