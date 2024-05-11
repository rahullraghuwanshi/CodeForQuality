# Sum of Two Numbers

#### Problem Statement

Given two numbers, the task is to print the sum of two numbers.

#### Solution and Explanation

To find the sum of two numbers, simply add them together.

## Flowchart

```
Start
|
|--- Input the first number
|       |
|       Store in variable "num1"
|       |
|--- Input the second number
|       |
|       Store in variable "num2"
|       |
|--- Calculate the sum
|       |
|       sum = num1 + num2
|       |
|--- Output the sum
|       |
|       Print sum
|       |
|--- End
```

The flowchart visually represents the steps involved in taking two numbers, calculating their sum, and then printing the result.

## Pseudocode

```
1. Start
2. Input the first number
3. Store the first number in variable "num1"
4. Input the second number
5. Store the second number in variable "num2"
6. Calculate the sum as sum = num1 + num2
7. Output the sum by printing it
8. End
```

The pseudocode provides a high-level description of the algorithm used to find the sum of two numbers.

## Kotlin Code

```kotlin
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the first number: ")
    val num1 = scanner.nextInt()

    println("Enter the second number: ")
    val num2 = scanner.nextInt()

    val sum = num1 + num2
    println("The sum of $num1 and $num2 is: $sum")
}

```

[Run above kotlin code](https://github.com/rahullraghuwanshi/CodeForQuality/blob/main/src/main/java/learner/rahulraghuwanshi/flowcharts_and_pseudocode/questions/code/code_2.kt)


The Kotlin code implements the logic described in the pseudocode to take two numbers, calculate their sum, and print the result. You can replace `num1` and `num2` with any values you want to test.