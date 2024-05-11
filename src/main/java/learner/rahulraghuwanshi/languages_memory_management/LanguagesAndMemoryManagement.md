Sure, let's integrate examples into each section:

## Introduction to Programming

Programming involves writing instructions that a computer can execute to perform specific tasks. There are various types
of programming languages, each with its own characteristics and purposes.
Certainly! Here's an updated version with code examples for each type of programming language:

## Introduction to Programming

Programming involves writing instructions that a computer can execute to perform specific tasks. There are various types
of programming languages, each with its own characteristics and purposes.

### Types of Languages

1. **Procedural**
    - Specifies a series of well-structured steps and procedures to compose a program.
    - Contains a systematic order of statements, functions, and commands to complete a task.
    - **Example**: C programming language, where functions are used to perform specific tasks, and the program is
      structured using function calls and control structures like loops and conditionals.
    ```c
    #include <stdio.h>

    // Function to calculate factorial
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    int main() {
        int num = 5;
        int result = factorial(num);
        printf("Factorial of %d is %d\n", num, result);
        return 0;
    }
    ```

2. **Functional**
    - Programs are written using pure functions, which do not modify variables but only create new ones as output.
    - Used in situations where many operations need to be performed on the same set of data, such as in machine
      learning.
    - Supports first-class functions, allowing functions to be assigned to variables, passed as arguments, and returned
      from other functions.
    - **Example**: Kotlin programming language, where functions are treated as first-class citizens, and functional
      programming features are integrated into the language.
    ```kotlin
   // Function to calculate factorial
   fun factorial(n: Int): Int {
   return if (n == 0 || n == 1) {
              1
   } else {
            n * factorial(n - 1)
   }
   }

   fun main() {
   val num = 5
   val result = factorial(num)
   println("Factorial of $num is $result")
   }
   ```

3. **Object-Oriented**
    - Revolves around objects, which combine code and data.
    - Developed to make it easier to develop, debug, reuse, and maintain software by modeling real-world entities as
      objects.
    - **Example**: Java programming language, where classes represent objects, and methods define behavior. Objects
      interact with each other through method calls and inheritance.
    ```java
    // Class representing a Rectangle
    class Rectangle {
        private int length;
        private int width;

        // Constructor
        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        // Method to calculate area
        public int calculateArea() {
            return length * width;
        }
    }

    // Main class
    public class Main {
        public static void main(String[] args) {
            Rectangle rect = new Rectangle(5, 3);
            int area = rect.calculateArea();
            System.out.println("Area of rectangle: " + area);
        }
    }
    ```

These examples demonstrate how each type of programming language is used to solve problems and implement solutions,
providing a solid foundation for understanding programming concepts.

### Static vs Dynamic Languages

1. **Static**
    - Type checking is performed at compile time.
    - Errors are detected at compile time.
    - Requires declaring the datatype of variables before use, providing more control over the code.
    - **Example**: C++ programming language, where variable types are declared explicitly, and type errors are caught by
      the compiler during compilation.

2. **Dynamic**
    - Type checking is performed at runtime.
    - Errors might not show until the program is executed.
    - Does not require declaring variable datatypes, which can save time in writing code but might lead to runtime
      errors.
    - **Example**: Python programming language, where variables are dynamically typed, and type errors are discovered
      during program execution. For example:
        ```python
        x = 10  # x is dynamically assigned the integer value 10
        x = "hello"  # x is dynamically reassigned the string value "hello"
        ```

### Memory Management

Memory management involves allocating and deallocating memory for programs to run efficiently.

#### Stack and Heap Memory

- **Stack Memory**: Used for static memory allocation, such as local variables and function call stack. Managed
  automatically by the compiler.
    - **Example**: In C programming, local variables declared within a function are allocated on the stack and
      deallocated when the function exits.
      ```c
      void foo() {
          int x = 10; // x is allocated on the stack
      } // x is deallocated when the function exits
      ```

- **Heap Memory**: Used for dynamic memory allocation, such as objects created at runtime. Requires manual memory
  management or garbage collection.
    - **Example**: In C++, objects created using the `new` keyword are allocated on the heap and must be explicitly
      deallocated using the `delete` keyword.
      ```cpp
      int* ptr = new int; // allocate memory for an integer on the heap
      delete ptr; // deallocate memory when no longer needed
      ```

### Garbage Collection

Garbage collection is the process of automatically reclaiming memory occupied by objects that are no longer in use. It
helps prevent memory leaks and inefficient memory usage.

- **Example**: In Java programming, garbage collection is performed by the Java Virtual Machine (JVM), which
  automatically deallocates memory for objects that are no longer referenced by the program.
    ```java
    // Example Java code with automatic garbage collection
    MyClass obj = new MyClass(); // allocate memory for an object
    obj = null; // remove reference to the object
    // Garbage collector automatically deallocates memory for the object
    ```

---