### Binary Search in a 2D Array

Binary search in a 2D array can be more complex than in a 1D array because we need to consider the two dimensions. There are different ways to approach this, depending on whether the entire 2D array is sorted or if each row and column is sorted independently.

#### Binary Search on a Sorted 2D Array
If the entire 2D array is sorted in a row-major order (i.e., each row and each column is sorted and the last element of a row is less than the first element of the next row), you can treat it as a 1D array for the purpose of binary search.

**Example of Binary Search on a Sorted 2D Array**:
```java
public class BinarySearch2D {
    public static boolean binarySearch2D(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; // Element not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        boolean result = binarySearch2D(matrix, target);
        System.out.println("Element found: " + result); // Output: true
    }
}
```

#### Binary Search on Each Row of a 2D Array
If each row of the 2D array is sorted independently (but the array as a whole is not necessarily sorted), you can perform a binary search on each row.

**Example of Binary Search on Each Row**:
```java
public class BinarySearch2DRow {
    public static boolean binarySearchEachRow(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (binarySearch(row, target)) {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] row, int target) {
        int left = 0;
        int right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; // Element not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16}
        };
        int target = 5;
        boolean result = binarySearchEachRow(matrix, target);
        System.out.println("Element found: " + result); // Output: true
    }
}
```

### Summary
- **Binary Search on Sorted 2D Array**: Treat the 2D array as a 1D array and perform binary search.
- **Binary Search on Each Row of a 2D Array**: Perform binary search on each row individually if each row is sorted independently.

These methods ensure efficient searching in a 2D array depending on how the data is structured and sorted.