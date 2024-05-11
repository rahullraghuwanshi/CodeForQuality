# Multiplication Table Generator

#### Problem Statement

Given a number, the task is to print the multiplication table for that number.

#### Solution and Explanation

To generate the multiplication table for a given number, we need to iterate from 1 to 10 and multiply the given number by each iteration value.

## Flowchart

```
Start
|
|--- Input the number
|       |
|       Store in variable "number"
|       |
|--- Initialize loop counter "i" to 1
|       |
|       |--- Loop until "i" reaches 10
|       |       |
|       |       Calculate product = number * i
|       |       |
|       |       Output: "number x i = product"
|       |       |
|       |       Increment "i" by 1
|       |
|       End loop
|--- End
```

The flowchart visually represents the steps involved in taking a number as input, generating its multiplication table, and printing the results.

## Pseudocode

```
1. Start
2. Input the number
3. Store the input number in variable "number"
4. Initialize loop counter "i" to 1
5. Loop until "i" reaches 10
6.     Calculate product as number * i
7.     Output: "number x i = product"
8.     Increment "i" by 1
9. End loop
10. End
```

The pseudocode provides a high-level description of the algorithm used to generate the multiplication table for a given number.

## Kotlin Code

```kotlin
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    println("Enter the number to generate its multiplication table: ")
    val number = scanner.nextInt()

    println("Multiplication table for $number:")
    for (i in 1..10) {
        val product = number * i
        println("$number x $i = $product")
    }
}
```

The Kotlin code implements the logic described in the pseudocode to take a number as input, generate its multiplication table, and print the results. It dynamically takes input from the user and generates the multiplication table accordingly.