
## Question : What is SupervisorScope?


`SupervisorScope` is a coroutine scope in Kotlin that provides supervision for child coroutines. It is used to create a coroutine scope where failures in one child coroutine do not affect the completion of other child coroutines. In other words, it allows child coroutines to fail independently without propagating exceptions to their parent scope.

### Key Features of SupervisorScope:

1. **Independent Failure Handling**: Child coroutines launched within a `SupervisorScope` can fail independently. If one child coroutine encounters an exception and fails, it does not affect the other child coroutines or the parent scope.

2. **Supervision Strategy**: `SupervisorScope` implements a "fail-fast" strategy, where it does not cancel other child coroutines when one child coroutine fails. Instead, it lets them continue their execution.

3. **Structured Concurrency**: `SupervisorScope` enforces structured concurrency by ensuring that all child coroutines launched within it are cancelled when the parent coroutine completes or is cancelled.

### Example Usage:

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

In this example, we create a `SupervisorScope` using the `supervisorScope` builder function. Inside the `SupervisorScope`, we launch three child coroutines. The second child coroutine intentionally throws an exception. However, the failure of the second child coroutine does not affect the completion of the other child coroutines (`child1` and `child3`). As a result, the parent coroutine completes successfully after waiting for all child coroutines to complete or fail.

### When to Use SupervisorScope:

- **Independent Failure Handling**: When you need child coroutines to fail independently without affecting other child coroutines.
- **Fault Isolation**: When you want to isolate failures in child coroutines and prevent them from propagating to the parent scope.

### Summary:

- `SupervisorScope` provides supervision for child coroutines, allowing them to fail independently without affecting other child coroutines or the parent scope.
- It implements a "fail-fast" strategy, where it does not cancel other child coroutines when one child coroutine fails.
- `SupervisorScope` enforces structured concurrency by cancelling all child coroutines when the parent coroutine completes or is cancelled.
- Use `SupervisorScope` when you need independent failure handling and fault isolation for child coroutines.