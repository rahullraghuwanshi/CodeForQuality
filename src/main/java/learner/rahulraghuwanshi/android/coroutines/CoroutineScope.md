
## Questions: How to manage series and parallel execution?

Managing series (sequential) and parallel execution in Kotlin coroutines can be done using various coroutine builders and mechanisms provided by the kotlinx.coroutines library. Here’s how you can handle both types of execution:

### Sequential Execution

Sequential execution is where tasks are executed one after the other. In Kotlin coroutines, you can achieve this by simply using the `suspend` keyword and `await` on deferred results.

#### Example using `launch` and `suspend` functions

```kotlin
import kotlinx.coroutines.*

suspend fun task1() {
    delay(1000L)
    println("Task 1 completed")
}

suspend fun task2() {
    delay(1000L)
    println("Task 2 completed")
}

fun main() = runBlocking {
    task1() // Runs first
    task2() // Runs after task1 completes
}
```

### Parallel Execution

Parallel execution is where tasks are executed concurrently. In Kotlin coroutines, you can achieve this using `launch` or `async`.

#### Example using `launch`

```kotlin
import kotlinx.coroutines.*

suspend fun task1() {
    delay(1000L)
    println("Task 1 completed")
}

suspend fun task2() {
    delay(1000L)
    println("Task 2 completed")
}

fun main() = runBlocking {
    val job1 = launch { task1() }
    val job2 = launch { task2() }

    job1.join()
    job2.join()
}
```

#### Example using `async` for parallel execution and awaiting results

```kotlin
import kotlinx.coroutines.*

suspend fun task1(): String {
    delay(1000L)
    return "Task 1 completed"
}

suspend fun task2(): String {
    delay(1000L)
    return "Task 2 completed"
}

fun main() = runBlocking {
    val deferred1 = async { task1() }
    val deferred2 = async { task2() }

    val result1 = deferred1.await()
    val result2 = deferred2.await()

    println(result1)
    println(result2)
}
```

### Combining Sequential and Parallel Execution

You can combine both sequential and parallel execution patterns depending on the logic of your application.

#### Example combining both

```kotlin
import kotlinx.coroutines.*

suspend fun task1(): String {
    delay(1000L)
    return "Task 1 completed"
}

suspend fun task2(): String {
    delay(1000L)
    return "Task 2 completed"
}

suspend fun task3(): String {
    delay(1000L)
    return "Task 3 completed"
}

fun main() = runBlocking {
    // Execute task1 and task2 in parallel
    val deferred1 = async { task1() }
    val deferred2 = async { task2() }

    // Wait for task1 and task2 to complete
    val result1 = deferred1.await()
    val result2 = deferred2.await()

    println(result1)
    println(result2)

    // Execute task3 sequentially after task1 and task2 are complete
    val result3 = task3()
    println(result3)
}
```

### Structured Concurrency

Kotlin encourages the use of structured concurrency, where you define the scope of your coroutines. This helps in better managing coroutines, ensuring they are properly cancelled when not needed.

#### Example with `coroutineScope` for structured concurrency

```kotlin
import kotlinx.coroutines.*

suspend fun task1(): String {
    delay(1000L)
    return "Task 1 completed"
}

suspend fun task2(): String {
    delay(1000L)
    return "Task 2 completed"
}

suspend fun task3(): String {
    delay(1000L)
    return "Task 3 completed"
}

fun main() = runBlocking {
    coroutineScope {
        val deferred1 = async { task1() }
        val deferred2 = async { task2() }

        val result1 = deferred1.await()
        val result2 = deferred2.await()

        println(result1)
        println(result2)
    }

    // Execute task3 after coroutineScope completes
    val result3 = task3()
    println(result3)
}
```

### Summary

- **Sequential Execution**: Use simple `suspend` functions and `await` on deferred results to run tasks one after the other.
- **Parallel Execution**: Use `launch` for fire-and-forget parallel tasks or `async` to perform parallel tasks and await their results.
- **Combining Sequential and Parallel Execution**: Mix both patterns by strategically using `async` for parallel execution and awaiting results before proceeding with further sequential tasks.
- **Structured Concurrency**: Use `coroutineScope` or `supervisorScope` to manage coroutine lifecycles within a defined scope, ensuring better resource management and cancellation handling.

These patterns and tools allow you to effectively manage coroutines for both sequential and parallel task execution in Kotlin.