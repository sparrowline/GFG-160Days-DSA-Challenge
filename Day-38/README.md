# Search in a Row-Column Sorted Matrix

## Problem Statement

Given a **2D integer matrix** `mat[][]` of size `n x m`, where **each row and each column is sorted in increasing order**, and a number `x`, your task is to determine whether the element `x` exists in the matrix.

---

## Examples

### Example 1

- **Input:**  
  `mat = [[3, 30, 38],`  
  `       [20, 52, 54],`  
  `       [35, 60, 69]], x = 62`  
- **Output:** `false`  
- **Explanation:** Element `62` is not found in the matrix.

---

### Example 2

- **Input:**  
  `mat = [[18, 21, 27],`  
  `       [38, 55, 67]], x = 55`  
- **Output:** `true`  
- **Explanation:** Element `55` is found at position (1,1).

---

### Example 3

- **Input:**  
  `mat = [[1, 2, 3],`  
  `       [4, 5, 6],`  
  `       [7, 8, 9]], x = 3`  
- **Output:** `true`  
- **Explanation:** Element `3` is present in the matrix.

---

## Constraints

- `1 ≤ n, m ≤ 1000`
- `1 ≤ mat[i][j] ≤ 10^9`
- `1 ≤ x ≤ 10^9`

---

## Optimal Strategy – Search from Top Right Corner

**Observation:**  
Each row and column is sorted in increasing order.  
We can start from the **top-right element** and eliminate a row or column in each comparison.

### Approach:

1. Initialize `i = 0` (top row), `j = m - 1` (last column).
2. While `i < n` and `j >= 0`:
   - If `mat[i][j] == x`, return `true`
   - If `mat[i][j] > x`, move left (`j--`)
   - If `mat[i][j] < x`, move down (`i++`)
3. If not found, return `false`

---

## Java Implementation

```java
public class SearchMatrix {

    public boolean searchInSortedMatrix(int[][] mat, int n, int m, int x) {
        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            if (mat[i][j] == x)
                return true;
            else if (mat[i][j] > x)
                j--;
            else
                i++;
        }

        return false;
    }
}