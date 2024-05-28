
## Question : What happens if we call .cancel() from a coroutine scope?

When you call `.cancel()` on a `CoroutineScope`, it cancels all coroutines that were launched within that scope. This is a powerful mechanism for managing the lifecycle of coroutines and ensuring that resources are properly cleaned up when they are no longer needed.

### Detailed Behavior

1. **Cancellation of Active Coroutines**: All active coroutines that are running within the scope are cancelled. This includes both direct child coroutines and any nested coroutines launched within those children.
2. **Throwing `CancellationException`**: When a coroutine is cancelled, it throws a `CancellationException`. This exception is propagated up the coroutine hierarchy, causing any corresponding `try`/`catch` blocks to handle the cancellation if they need to.
3. **Resource Cleanup**: Any finally blocks or onCompletion handlers in the coroutines are executed to ensure that resources are cleaned up properly.
4. **Non-Cancellable Block**: Code inside `withContext(NonCancellable) { ... }` will run even if the coroutine is cancelled, allowing for final cleanup operations that should not be interrupted by cancellation.

### Example

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    val scope = CoroutineScope(Dispatchers.Default)

    val job1 = scope.launch {
        try {
            repeat(1000) { i ->
                println("Job1: I'm working on $i ...")
                delay(500L)
            }
        } finally {
            println("Job1: I'm cancelled")
        }
    }

    val job2 = scope.launch {
        try {
            repeat(1000) { i ->
                println("Job2: I'm working on $i ...")
                delay(500L)
            }
        } finally {
            println("Job2: I'm cancelled")
        }
    }

    delay(1500L) // Let them run for a bit
    println("Cancelling scope...")
    scope.cancel() // Cancel the scope and all its children
    println("Scope cancelled.")
}
```

### Output Explanation

1. **Starting Coroutines**: The `main` function creates a new coroutine scope and launches two coroutines within it (`job1` and `job2`).
2. **Running Coroutines**: Both coroutines print messages indicating that they are working on tasks.
3. **Cancelling Scope**: After a delay, the `scope.cancel()` call cancels both `job1` and `job2`.
4. **Handling Cancellation**: Both coroutines print a final message indicating they have been cancelled.

### Cancellation Propagation

When you cancel a coroutine scope, cancellation propagates to all coroutines within that scope, which helps manage the coroutine lifecycle effectively. For example, in Android development, you might cancel a scope tied to an Activity or ViewModel to stop ongoing work when the component is no longer needed.

### Use Cases

- **Activity/Fragment Lifecycle**: In Android, you can cancel coroutines tied to an Activity or Fragment when they are destroyed to prevent memory leaks.
- **Timeouts**: You can cancel a coroutine after a certain timeout to ensure that it doesn't run indefinitely.
- **User-initiated Cancellation**: If the user cancels a long-running operation, you can cancel the associated coroutine to stop work and release resources.

### Important Points

- **CancellationException**: This exception is used internally to handle cancellation and is typically not considered a failure. It is caught by the coroutine infrastructure to perform necessary cleanup.
- **Non-cancellable Operations**: If you need to perform cleanup that should not be interrupted by cancellation, you can use `withContext(NonCancellable) { ... }`.

### Example of Non-cancellable Block

```kotlin
val job = scope.launch {
    try {
        repeat(1000) { i ->
            println("Job: I'm working on $i ...")
            delay(500L)
        }
    } finally {
        withContext(NonCancellable) {
            println("Job: Running non-cancellable cleanup")
            delay(1000L) // Simulating cleanup work
            println("Job: Cleanup completed")
        }
    }
}
```

In this example, the cleanup code inside the `withContext(NonCancellable)` block will run even if the coroutine is cancelled.

By understanding and properly using `cancel()` on coroutine scopes, you can effectively manage the lifecycle and resource usage of coroutines in your applications.