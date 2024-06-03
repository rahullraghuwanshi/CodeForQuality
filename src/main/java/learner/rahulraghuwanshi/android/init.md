
## Question : What is an Init block in Kotlin?


In Kotlin, an `init` block is a special block of code inside a class that is executed when an instance of the class is created. It is primarily used for initialization purposes, allowing you to set up the initial state of an object and perform any necessary setup that needs to be done when an object is instantiated.

### Characteristics of the `init` Block

- **Executed During Initialization**: The `init` block runs as part of the constructor. When you create an instance of a class, the code within the `init` block is executed before the constructor completes.
- **Multiple `init` Blocks**: A class can have multiple `init` blocks, which are executed in the order they appear in the class.
- **Access to Primary Constructor Parameters**: The `init` block has access to the parameters of the primary constructor.

### Example

Here's a simple example to illustrate the use of the `init` block:

```kotlin
class Person(val name: String, val age: Int) {
    // Properties
    var greeting: String

    // Init block
    init {
        greeting = "Hello, my name is $name and I am $age years old."
        println("Init block: Person created with name = $name and age = $age")
    }

    // Another init block (optional)
    init {
        println("Another init block: Additional initialization if needed")
    }

    // Member function
    fun printGreeting() {
        println(greeting)
    }
}

fun main() {
    val person = Person("Alice", 30)
    person.printGreeting()
}
```

### Output

```
Init block: Person created with name = Alice and age = 30
Another init block: Additional initialization if needed
Hello, my name is Alice and I am 30 years old.
```

### Key Points

1. **Initialization Order**: If a class has multiple `init` blocks, they are executed in the order they appear in the class, before the constructor body.
2. **Constructor Parameters**: The `init` block can use the primary constructor parameters directly, as shown in the example where `name` and `age` are used to initialize the `greeting` property.
3. **Custom Initialization Logic**: You can put any custom initialization logic in the `init` block, such as setting up properties, performing validation, or logging.

### Comparison with Constructor

While the primary constructor in Kotlin allows for parameter initialization, the `init` block provides a more flexible way to run initialization code. This is particularly useful for complex initialization that might require multiple steps or additional logic.

```kotlin
class Person(val name: String, val age: Int) {
    var greeting: String = "Hello"

    init {
        greeting = "Hello, my name is $name and I am $age years old."
    }
}
```

In this example, the primary constructor initializes the `name` and `age` properties directly, while the `init` block sets up the `greeting` property based on those values.

### Multiple `init` Blocks

Having multiple `init` blocks is uncommon but can be useful for organizing initialization logic:

```kotlin
class Person(val name: String, val age: Int) {
    var greeting: String

    init {
        greeting = "Hello, my name is $name."
    }

    init {
        greeting += " I am $age years old."
    }
}
```

Each `init` block is executed in the order it appears, allowing for step-by-step initialization.

### Summary

The `init` block in Kotlin is a powerful feature for running initialization code during the construction of an object. It provides a clean and organized way to set up initial state and perform any necessary setup, making it a useful tool in Kotlin's class construction process.