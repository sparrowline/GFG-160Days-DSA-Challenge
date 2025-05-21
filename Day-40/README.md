# Search in a Strictly Sorted Matrix

## Problem Statement

Given a **strictly sorted** 2D matrix `mat[][]` of size `n x m` and a number `x`, determine whether `x` is present in the matrix.

> **Definition:**  
> A *strictly sorted matrix* is one where:
> - Each row is sorted in strictly increasing order.
> - The **first element** of each row (except the first row) is **greater than** the **last element** of the previous row.

This structure allows the entire matrix to be treated as a **flattened sorted 1D array**.

---

## Examples

### Example 1
- **Input:**  
  `mat = [[1, 5, 9],`  
  `       [14, 20, 21],`  
  `       [30, 34, 43]], x = 14`  
- **Output:** `true`  
- **Explanation:** Element `14` is present in the matrix.

---

### Example 2
- **Input:**  
  `mat = [[1, 5, 9, 11],`  
  `       [14, 20, 21, 26],`  
  `       [30, 34, 43, 50]], x = 42`  
- **Output:** `false`  
- **Explanation:** Element `42` is not present.

---

### Example 3
- **Input:**  
  `mat = [[87, 96, 99],`  
  `       [101, 103, 111]], x = 101`  
- **Output:** `true`  
- **Explanation:** Element `101` is present in the matrix.

---

## Constraints

- `1 ≤ n, m ≤ 1000`
- `1 ≤ mat[i][j] ≤ 10^9`
- `1 ≤ x ≤ 10^9`

---

## Optimal Strategy – Binary Search as 1D Matrix

Due to the matrix’s strictly increasing nature across both rows and columns, you can perform a **binary search** by treating the 2D matrix as a **virtual 1D array**.

### Approach

1. Treat matrix as a 1D array of length `n * m`.
2. Perform binary search between `low = 0` and `high = n * m - 1`.
3. Convert 1D index to 2D using:  
   `row = index / m`, `col = index % m`
4. Compare `mat[row][col]` with `x`.
5. Return `true` if found, else `false`.

---

## Java Implementation

```java
public class StrictlySortedMatrixSearch {

    public boolean searchMatrix(int[][] mat, int n, int m, int x) {
        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = mat[mid / m][mid % m];

            if (midValue == x)
                return true;
            else if (midValue < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}