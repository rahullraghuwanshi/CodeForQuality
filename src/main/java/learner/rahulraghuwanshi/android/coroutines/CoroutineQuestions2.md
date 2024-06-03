
## Questions : Why Coroutines are light weight?

Coroutines are lightweight primarily due to their cooperative nature and the way they are implemented in Kotlin. Here are several reasons why coroutines are considered lightweight:

### 1. Cooperative Scheduling

Coroutines are cooperatively scheduled, meaning they voluntarily yield control back to the scheduler when they are suspended. This cooperative nature eliminates the need for costly context switches that are required for preemptive multitasking used by threads.

### 2. User-Space Switching

Coroutines are managed entirely in user space, without involving the operating system's scheduler for context switches. This allows for faster switching between coroutines, as it avoids the overhead of kernel-level operations.

### 3. Single Threaded by Default

By default, coroutines run in a single thread, which reduces the overhead associated with managing multiple threads and their synchronization. This makes them particularly efficient for scenarios where true parallelism is not required.

### 4. Minimal Stack Space

Coroutines have a minimal stack space compared to threads. Each coroutine typically has its own stack, but coroutines are designed to be much smaller in size compared to thread stacks. This reduces memory consumption and allows for the creation of a large number of coroutines without exhausting system resources.

### 5. Low Memory Footprint

Coroutines have a low memory footprint compared to threads. Since they are lightweight and use cooperative scheduling, they can be created and destroyed more efficiently, reducing memory usage.

### 6. Cheap to Create and Dispose

Creating and disposing of coroutines is cheaper compared to threads. Coroutines can be launched and cancelled quickly without incurring the overhead associated with creating and destroying operating system-level threads.

### 7. Asynchronous I/O

Coroutines are particularly efficient for handling asynchronous I/O operations. Instead of blocking threads while waiting for I/O operations to complete, coroutines can be suspended and resumed later when the I/O operation is finished, allowing the underlying thread to perform other tasks in the meantime.

### Summary

Coroutines are lightweight due to their cooperative nature, user-space switching, minimal stack space, low memory footprint, and efficiency in handling asynchronous operations. These characteristics make coroutines an attractive option for handling concurrency and asynchronous programming in Kotlin, especially in scenarios where high concurrency and scalability are important considerations.