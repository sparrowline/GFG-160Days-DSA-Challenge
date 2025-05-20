# Search in a Row-Wise Sorted Matrix

## Problem Statement

Given a **row-wise sorted** 2D matrix `mat[][]` of size `n x m` and an integer `x`, your task is to determine whether `x` exists in the matrix.

> **Note:** In a row-wise sorted matrix, each individual row is sorted in non-decreasing order, i.e.,  
> for any valid `i` and `j`, we have `mat[i][j] <= mat[i][j+1]`.

---

## Examples

### Example 1

- **Input:**  
  `mat = [[3, 4, 9],`  
  `       [2, 5, 6],`  
  `       [9, 25, 27]], x = 9`  
- **Output:** `true`  
- **Explanation:** Element `9` is present in the matrix.

---

### Example 2

- **Input:**  
  `mat = [[19, 22, 27, 38, 55, 67]], x = 56`  
- **Output:** `false`  
- **Explanation:** Element `56` is not present in the matrix.

---

### Example 3

- **Input:**  
  `mat = [[1, 2, 9],`  
  `       [65, 69, 75]], x = 91`  
- **Output:** `false`  
- **Explanation:** Element `91` is not present in the matrix.

---

## Constraints

- `1 ≤ n, m ≤ 1000`
- `1 ≤ mat[i][j] ≤ 10^5`
- `1 ≤ x ≤ 10^5`

---

## Optimal Strategy – Binary Search on Each Row

Since each row is independently sorted in non-decreasing order, the most optimal way is to perform a **binary search on each row**.

### Approach:

1. Traverse each row of the matrix.
2. For each row, apply binary search.
3. If the element is found in any row, return `true`.
4. If not found in any row, return `false`.

---
