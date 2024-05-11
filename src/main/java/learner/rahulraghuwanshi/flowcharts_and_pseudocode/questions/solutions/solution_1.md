# Leap Year Checker

### Problem Statement

Given a year, the task is to determine whether it is a leap year or not.

### Solution and Explanation

To determine whether a year is a leap year or not, we can follow these rules:
1. If the year is divisible by 4, it is a leap year.
2. If the year is divisible by 100, it is not a leap year unless it is also divisible by 400.

## Flowchart

```
Start
|
|--- Is the year divisible by 4?
|       |
|       Yes
|       |
|       |--- Is the year divisible by 100?
|               |
|               Yes
|               |
|               |--- Is the year divisible by 400?
|                       |
|                       Yes
|                       |
|                       Output: Leap year
|                       |
|                       End
|                       |
|                       No
|                       |
|                       Output: Not a leap year
|                       |
|                       End
|               |
|               No
|               |
|               Output: Leap year
|               |
|               End
|
No
|
Output: Not a leap year
|
End
```

The flowchart visually represents the logic for checking whether a given year is a leap year or not. It follows the rules mentioned above to make the decision.

## Pseudocode

```
1. Start
2. Take input of year
3. If (year is divisible by 4) then
4.     If (year is divisible by 100) then
5.         If (year is divisible by 400) then
6.             Print "Leap year"
7.         Else
8.             Print "Not a leap year"
9.     Else
10.        Print "Leap year"
11. Else
12.    Print "Not a leap year"
13. End
```

The pseudocode provides a high-level description of the algorithm used to determine whether a given year is a leap year or not.

## Kotlin Code

```kotlin
fun main() {
    val year = 2024 // Change this to any year you want to check

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                println("$year is a leap year")
            } else {
                println("$year is not a leap year")
            }
        } else {
            println("$year is a leap year")
        }
    } else {
        println("$year is not a leap year")
    }
}
```

The Kotlin code implements the logic described in the pseudocode to check whether a given year is a leap year or not. Replace `year` variable with any value you want to test.