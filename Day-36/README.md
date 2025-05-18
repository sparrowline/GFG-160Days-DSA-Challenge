# Spirally Traversing a Matrix

## Problem Statement

You are given a **rectangular matrix** `mat[][]` of size `n x m`.  
Your task is to **return an array of elements** obtained by traversing the matrix in **spiral order** (clockwise direction, layer by layer).

---

## Examples

### Example 1

- **Input:**  
  `mat = [[1, 2, 3, 4],`  
  `       [5, 6, 7, 8],`  
  `       [9, 10, 11, 12],`  
  `       [13, 14, 15, 16]]`  
- **Output:**  
  `[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]`

---

### Example 2

- **Input:**  
  `mat = [[1, 2, 3, 4, 5, 6],`  
  `       [7, 8, 9, 10, 11, 12],`  
  `       [13, 14, 15, 16, 17, 18]]`  
- **Output:**  
  `[1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]`

---

### Example 3

- **Input:**  
  `mat = [[32, 44, 27, 23], [54, 28, 50, 62]]`  
- **Output:**  
  `[32, 44, 27, 23, 62, 50, 28, 54]`

---

## Constraints

- `1 ≤ n, m ≤ 1000`
- `0 ≤ mat[i][j] ≤ 100`

---

## Optimal Strategy – Layer-by-Layer Traversal

We define four boundaries:

- `top` – starting row index
- `bottom` – ending row index
- `left` – starting column index
- `right` – ending column index

Repeat the following until all layers are processed:

1. Traverse top row → from `left` to `right`
2. Traverse rightmost column ↓ from `top + 1` to `bottom`
3. Traverse bottom row ← from `right - 1` to `left` (only if `top != bottom`)
4. Traverse leftmost column ↑ from `bottom - 1` to `top + 1` (only if `left != right`)

---
