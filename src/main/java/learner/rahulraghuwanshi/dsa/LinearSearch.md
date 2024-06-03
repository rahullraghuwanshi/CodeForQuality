### Linear Search Algorithm

#### 1. What is linear search.
Linear search, also known as sequential search, is a simple search algorithm that checks each element of a list or array one by one in sequence until the desired element is found or the list ends. It is suitable for small lists or unsorted lists.

#### 2. Code for linear search (Search in the array. Return index if item found, if not then -1)
```java
public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int index = linearSearch(array, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

#### 3. Search in string.
Linear search can also be used to search for a character in a string.

```java
public class LinearSearchString {
    public static int linearSearch(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1; // Character not found
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        char target = 'w';
        int index = linearSearch(str, target);
        if (index != -1) {
            System.out.println("Character found at index: " + index);
        } else {
            System.out.println("Character not found");
        }
    }
}
```

#### 4. Find minimum/maximum number in an array.
To find the minimum and maximum number in an array:

```java
public class MinMaxInArray {
    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Minimum value: " + findMinimum(array)); // Output: 10
        System.out.println("Maximum value: " + findMaximum(array)); // Output: 50
    }
}
```

#### 5. Search in 2D array.
Linear search in a 2D array:

```java
public class LinearSearch2D {
    public static int[] linearSearch(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return new int[]{i, j}; // Return the indices
                }
            }
        }
        return new int[]{-1, -1}; // Element not found
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        int[] result = linearSearch(array, target);
        if (result[0] != -1) {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found");
        }
    }
}
```

#### 6. Even Digits.
To count the numbers with an even number of digits in an array:

```java
public class EvenDigits {
    public static int countEvenDigitNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (Integer.toString(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1234, 567, 89, 12345, 67890};
        System.out.println("Count of numbers with even digits: " + countEvenDigitNumbers(array));
    }
}
```

#### 7. Max wealth check.
Given a 2D array representing wealth of individuals in different banks, find the maximum wealth:

```java
public class MaxWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int money : account) {
                wealth += money;
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        System.out.println("Maximum wealth: " + maximumWealth(accounts));
    }
}
```
