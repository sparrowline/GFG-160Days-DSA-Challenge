# Rotate a Square Matrix by 90 Degrees Anti-Clockwise (In-Place)

## Problem Statement

You are given a square matrix `mat[][]` of size `n x n`. Your objective is to rotate the matrix by **90 degrees in anti-clockwise direction**, and do so **in-place**, i.e., without using any additional space for another matrix.

---

## Examples

### Example 1

- **Input:**  
  `mat = [[1, 2, 3],`  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`[4, 5, 6],`  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`[7, 8, 9]]`  
- **Output:**  
  `[[3, 6, 9],`  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`[2, 5, 8],`  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`[1, 4, 7]]`

---

### Example 2

- **Input:**  
  `mat = [[1, 2], [3, 4]]`  
- **Output:**  
  `[[2, 4], [1, 3]]`

---

## Constraints

- `1 ≤ n ≤ 10²`
- `0 ≤ mat[i][j] ≤ 10³`

---

## Optimal Approach – Transpose + Reverse Columns (In-Place)

### Key Insight

To rotate a matrix 90° anti-clockwise without extra space:

1. **Transpose** the matrix:  
   Swap elements across the diagonal (`mat[i][j] <=> mat[j][i]`)
2. **Reverse the columns**:  
   For each column, swap the top element with the bottom, moving inward.

This process repositions each element correctly without allocating any extra memory.

---

## Java Implementation

```java
public class RotateMatrixAntiClockwise {

    public void rotate90AntiClockwise(int[][] mat) {
        int n = mat.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each column
        for (int col = 0; col < n; col++) {
            int top = 0, bottom = n - 1;
            while (top < bottom) {
                int temp = mat[top][col];
                mat[top][col] = mat[bottom][col];
                mat[bottom][col] = temp;
                top++;
                bottom--;
            }
        }
    }
}