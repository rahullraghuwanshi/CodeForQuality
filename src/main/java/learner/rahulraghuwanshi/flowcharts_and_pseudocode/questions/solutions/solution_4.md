# HCF and LCM Calculator

#### Problem Statement

Certainly! Let's delve deeper into the explanation of finding the HCF and LCM of two numbers.

### Highest Common Factor (HCF)

The HCF of two numbers is the largest positive integer that divides both numbers without leaving a remainder. It is also known as the greatest common divisor (GCD) or greatest common factor (GCF). To find the HCF of two numbers, we often use the Euclidean algorithm.

#### Euclidean Algorithm

The Euclidean algorithm is a method for finding the greatest common divisor of two numbers. It involves repeatedly dividing the larger number by the smaller number and replacing the larger number with the remainder until the remainder is zero. The last non-zero remainder is the greatest common divisor of the two numbers.

### Lowest Common Multiple (LCM)

The LCM of two numbers is the smallest positive integer that is divisible by both numbers. It is also known as the least common multiple. To find the LCM of two numbers, we can use the relationship between HCF and LCM:

```
LCM = (number1 * number2) / HCF
```

### Example

Let's consider an example with two numbers: 12 and 18.

#### Finding HCF (GCD)

We use the Euclidean algorithm to find the HCF:
```
18 = 1 * 12 + 6
12 = 2 * 6 + 0
```
The last non-zero remainder is 6, so HCF(12, 18) = 6.

#### Finding LCM

Using the formula, LCM = (12 * 18) / 6 = 36.

### Conclusion

Finding the HCF and LCM of two numbers involves understanding the relationship between their factors and multiples. The HCF is the largest common factor, while the LCM is the smallest common multiple. By using the Euclidean algorithm and the relationship between HCF and LCM, we can efficiently calculate these values for any two numbers.
```
Formula : 
Product of Two numbers = (HCF of the two numbers) x (LCM of the two numbers)
```

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
|--- Calculate HCF using Euclidean algorithm
|       |
|       |--- While num2 is not equal to 0
|       |       |
|       |       Calculate remainder = num1 % num2
|       |       |
|       |       Set num1 = num2
|       |       Set num2 = remainder
|       |
|       |--- Output: HCF = num1
|       |
|--- Calculate LCM using the formula LCM = (num1 * num2) / HCF
|       |
|       Calculate LCM = (num1 * num2) / HCF
|       |
|       Output: LCM
|       |
|--- End
```

The flowchart visually represents the steps involved in taking two numbers as input, finding their HCF using the Euclidean algorithm, calculating their LCM, and printing the results.

## Pseudocode

```
1. Start
2. Input the first number and store it in variable "num1"
3. Input the second number and store it in variable "num2"
4. Calculate HCF using Euclidean algorithm:
5.     While num2 is not equal to 0 do:
6.         Calculate remainder = num1 % num2
7.         Set num1 = num2
8.         Set num2 = remainder
9.     End while
10. Output: HCF = num1
11. Calculate LCM using the formula LCM = (num1 * num2) / HCF
12. Output: LCM
13. End
```

The pseudocode provides a high-level description of the algorithm used to find the HCF and LCM of two numbers.

## Kotlin Code

```kotlin
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Input the first number
    println("Enter the first number: ")
    val num1 = scanner.nextInt()

    // Input the second number
    println("Enter the second number: ")
    val num2 = scanner.nextInt()

    // Ensure tempNum1 holds the greater value
    var tempNum1 = if (num1 > num2) num1 else num2
    var tempNum2 = if (num1 > num2) num2 else num1

    // Calculate HCF using the Euclidean algorithm
    var gcd = 1
    while (tempNum2 != 0) {
        val remainder = tempNum1 % tempNum2
        tempNum1 = tempNum2
        tempNum2 = remainder
    }
    gcd = tempNum1

    // Calculate LCM using the formula LCM = (num1 * num2) / HCF
    val lcm = (num1 * num2) / gcd

    // Output the results
    println("HCF of $num1 and $num2 is: $gcd")
    println("LCM of $num1 and $num2 is: $lcm")
}

```

[Run above kotlin code](https://github.com/rahullraghuwanshi/CodeForQuality/blob/main/src/main/java/learner/rahulraghuwanshi/flowcharts_and_pseudocode/questions/code/code_4.kt)


The Kotlin code dynamically takes input from the user for two numbers, finds their HCF using the Euclidean algorithm, calculates their LCM, and prints the results accordingly.