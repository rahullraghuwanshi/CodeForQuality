
## Question : Exception Handling in Coroutine

Exception handling in Kotlin Coroutines allows you to handle exceptions that occur during the execution of coroutines. Kotlin provides several mechanisms for exception handling in coroutines:

### 1. `try-catch` Blocks:

You can use standard `try-catch` blocks to catch exceptions within coroutines, just like in regular synchronous code.

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        coroutineScope {
            launch {
                delay(100)
                throw RuntimeException("Coroutine failed")
            }
        }
    } catch (e: Exception) {
        println("Exception caught: ${e.message}")
    }
}
```

### 2. Coroutine Exception Handlers:

You can define a custom coroutine exception handler using `CoroutineExceptionHandler` to handle uncaught exceptions from coroutines within a particular scope.

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        println("CoroutineExceptionHandler caught $exception")
    }

    val job = GlobalScope.launch(exceptionHandler) {
        throw RuntimeException("Coroutine failed")
    }

    job.join()
}
```

### 3. SupervisorScope:

`SupervisorScope` can be used to create a scope where failures in one child coroutine do not affect the completion of other child coroutines.

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    supervisorScope {
        val child1 = launch {
            delay(100)
            println("Child coroutine 1 completed")
        }

        val child2 = launch {
            delay(200)
            throw RuntimeException("Child coroutine 2 failed")
        }

        val child3 = launch {
            delay(300)
            println("Child coroutine 3 completed")
        }

        // Wait for all child coroutines to complete
        child1.join()
        child2.join()
        child3.join()
    }
    println("All child coroutines completed or failed")
}
```

### 4. Handling Deferred Exceptions:

When using `async` to create a deferred result, you can use `await` to retrieve the result and handle any exceptions that occurred during the execution of the coroutine.

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    val deferred = async {
        delay(100)
        throw RuntimeException("Deferred coroutine failed")
    }

    try {
        val result = deferred.await()
        println("Deferred coroutine result: $result")
    } catch (e: Exception) {
        println("Exception caught: ${e.message}")
    }
}
```

### Summary:

- Exception handling in Kotlin Coroutines can be done using standard `try-catch` blocks, coroutine exception handlers (`CoroutineExceptionHandler`), `SupervisorScope`, and handling deferred exceptions.
- Choose the appropriate exception handling mechanism based on your requirements and the scope of your coroutines.