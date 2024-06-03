
### Arrays & ArrayList in Java

#### 1. Why we need arrays and syntax with example.
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value. They are particularly useful when you need to work with large amounts of data.

**Syntax**:
```java
int[] myArray = new int[5]; // Declaration and instantiation
myArray[0] = 10; // Initialization
```

**Example**:
`java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Output: 1
`

#### 2. How does array work.
An array works by storing elements at contiguous memory locations. Each element in the array can be accessed by its index.

#### 3. Internal working of an Array.
Internally, arrays are stored in contiguous memory locations. The index of the array starts from 0 and each element can be accessed using this index.

#### 4. Dynamic memory allocation.
Arrays in Java are dynamically allocated using the `new` keyword. The size of the array is specified at the time of creation and cannot be changed.

```java
int[] myArray = new int[10]; // Allocates memory for 10 integers
```

#### 5. Internal Representation of Array.
Arrays are internally represented as contiguous blocks of memory with a fixed length, which is set at the time of creation.

#### 6. Continuity of Array.
While arrays are generally continuous in memory, this continuity might be managed differently by the JVM depending on its implementation. However, for the programmer, arrays appear continuous.

#### 7. Index of an Array.
Array indices start from 0 and go up to `length - 1`.

```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30
```

#### 8. Default values in array and String array.
- For numeric types (int, float, etc.), the default value is 0.
- For boolean, the default value is `false`.
- For object references (like String), the default value is `null`.

```java
int[] numbers = new int[5]; // {0, 0, 0, 0, 0}
String[] strings = new String[5]; // {null, null, null, null, null}
```

#### 9. What is null in Java.
`null` is a literal in Java that represents a null reference, meaning that the variable does not point to any object or memory location.

#### 10. Null is used as default value for non primitive type arrays.
For arrays of non-primitive types (like objects), the default value for each element is `null`.

#### 11. Array Input
To take array input from the user:

```java
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] array = new int[n];
for (int i = 0; i < n; i++) {
    array[i] = scanner.nextInt();
}
```

#### 12. For each loop for arrays.
A for-each loop is used to iterate over elements of an array.

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}
```

#### 13. Array.toString(array).
The `Arrays.toString()` method is used to get a string representation of the array.

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 4, 5]
```

#### 14. Array of objects.
You can create an array of objects, and each element of the array will be an object reference.

```java
String[] strings = new String[3];
strings[0] = "Hello";
strings[1] = "World";
strings[2] = "!";
```

#### 15. Storage of Objects in Heap.
Objects in Java are stored in the heap memory, and references to these objects are stored in stack memory.

#### 16. Array passing in functions.
Arrays can be passed to methods as parameters.

```java
public void printArray(int[] array) {
    for (int element : array) {
        System.out.println(element);
    }
}
```

#### 17. Multidimensional arrays (2D arrays).
A 2D array is an array of arrays.

```java
int[][] matrix = new int[3][3];
matrix[0][0] = 1;
matrix[0][1] = 2;
```

#### 18. Internal working of 2D arrays.
2D arrays in Java are arrays of arrays. Each element of the main array is a reference to another array.

#### 19. 2D array input.
To take input for a 2D array:

```java
Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();
int cols = scanner.nextInt();
int[][] array = new int[rows][cols];
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        array[i][j] = scanner.nextInt();
    }
}
```

#### 20. 2D array output.
To print a 2D array:

```java
for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
    }
    System.out.println();
}
```

#### 21. Dynamic arrays.
Java arrays are of fixed size, but dynamic arrays can be implemented using `ArrayList`.

#### 22. Why we need an ArrayList.
ArrayLists are used when we need a resizable array, meaning an array whose size can grow and shrink dynamically.

#### 23. What is ArrayList. Syntax of ArrayList.
ArrayList is a part of Java's `java.util` package that provides dynamic arrays in Java.

```java
ArrayList<Integer> list = new ArrayList<>();
```

#### 24. ArrayList functions.
Some common functions:
- `add()`
- `get()`
- `set()`
- `remove()`
- `size()`

```java
list.add(1);
list.add(2);
int value = list.get(0); // 1
list.set(0, 10);
list.remove(1);
int size = list.size();
```

#### 25. Internal working of ArrayList.
Internally, an `ArrayList` uses an array to store elements. When elements are added and the array runs out of space, a new array is created with a larger capacity, and the old array's elements are copied to the new array.

#### 26. Multidimensional ArrayList.
You can create a multidimensional `ArrayList` by creating an `ArrayList` of `ArrayLists`.

```java
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
ArrayList<Integer> row = new ArrayList<>();
row.add(1);
row.add(2);
matrix.add(row);
```

#### 27. Swapping values in array.
To swap values in an array:

```java
int temp = array[i];
array[i] = array[j];
array[j] = temp;
```

#### 28. Maximum value of an array.
To find the maximum value in an array:

```java
int max = array[0];
for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i];
    }
}
```

#### 29. Reverse an array.
To reverse an array:

```java
int n = array.length;
for (int i = 0; i < n / 2; i++) {
    int temp = array[i];
    array[i] = array[n - 1 - i];
    array[n - 1 - i] = temp;
}
```

#### 30. Conclusion
Arrays and ArrayLists are essential for handling collections of data in Java. Arrays provide a way to store fixed-size collections of elements, while ArrayLists offer more flexibility with dynamic resizing capabilities. Both data structures are fundamental in Java programming and understanding their internal workings, usage, and differences is crucial for efficient coding.