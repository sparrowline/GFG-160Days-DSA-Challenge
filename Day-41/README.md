# Set Matrix Zeroes

## Problem Statement

You are given a 2D matrix `mat[][]` of size `n x m`. Your task is to modify the matrix in-place such that **if any cell `mat[i][j] == 0`, then all elements in the `i-th` row and `j-th` column** are set to **0**.  
This must be done using **constant space complexity**, i.e., **O(1)** extra space.

---

## Examples

### Example 1
- **Input:**  
  `mat = [[1, -1, 1],`  
  `       [-1, 0, 1],`  
  `       [1, -1, 1]]`
- **Output:**  
  `[[1, 0, 1],`  
  ` [0, 0, 0],`  
  ` [1, 0, 1]]`
- **Explanation:** `mat[1][1] == 0`, so row 1 and column 1 are set to 0.

---

### Example 2
- **Input:**  
  `mat = [[0, 1, 2, 0],`  
  `       [3, 4, 5, 2],`  
  `       [1, 3, 1, 5]]`
- **Output:**  
  `[[0, 0, 0, 0],`  
  ` [0, 4, 5, 0],`  
  ` [0, 3, 1, 0]]`
- **Explanation:** `mat[0][0]` and `mat[0][3]` are 0, so rows and columns are zeroed accordingly.

---

## Constraints

- `1 ≤ n, m ≤ 500`
- `-2^31 ≤ mat[i][j] ≤ 2^31 - 1`

---

## Approach – In-Place with O(1) Space

### Key Idea

Use the **first row and first column** as **marker storage** to track which rows and columns should be zeroed out.  
Additionally, use two flags:
- `rowZero` to check if the first row should be zeroed.
- `colZero` to check if the first column should be zeroed.

---

### Steps

1. **Scan First Row & First Column:**  
   - Track if first row and column contain any `0`.

2. **Use Matrix as Flags:**  
   - For all elements `mat[i][j] == 0`, mark `mat[i][0] = 0` and `mat[0][j] = 0`.

3. **Zero Out Marked Rows & Columns:**  
   - Traverse the matrix again and zero out cells based on flags in `mat[0][*]` and `mat[*][0]`.

4. **Handle First Row and Column Separately:**  
   - Based on `rowZero` and `colZero` flags, update first row and column if needed.

---

## Java Implementation

```java
public class SetMatrixZeroes {

    public void setZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        boolean rowZero = false, colZero = false;

        // Check if first row has a zero
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 0) {
                rowZero = true;
                break;
            }
        }

        // Check if first column has a zero
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 0) {
                colZero = true;
                break;
            }
        }

        // Use first row and column as markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        // Apply zeroes based on markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // Zero out first row if needed
        if (rowZero) {
            for (int j = 0; j < m; j++) {
                mat[0][j] = 0;
            }
        }

        // Zero out first column if needed
        if (colZero) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
    }
}