# Merge Two Sorted Arrays Without Extra Space

## Problem Statement

You are given two **sorted arrays** `a[]` and `b[]` of size `n` and `m` respectively.  
Your task is to **merge both arrays** in a sorted manner **without using any extra space**.

- After merging, the smallest `n` elements should be in array `a[]`
- The remaining `m` elements should be in array `b[]`

---

## Examples

### Example 1

- **Input:**  
  `a[] = [2, 4, 7, 10]`  
  `b[] = [2, 3]`
- **Output:**  
  `a[] = [2, 2, 3, 4]`  
  `b[] = [7, 10]`
- **Explanation:**  
  Merged array: `[2, 2, 3, 4, 7, 10]`  
  `a[]` gets the first 4 smallest elements, `b[]` gets the remaining.

---

### Example 2

- **Input:**  
  `a[] = [1, 5, 9, 10, 15, 20]`  
  `b[] = [2, 3, 8, 13]`
- **Output:**  
  `a[] = [1, 2, 3, 5, 8, 9]`  
  `b[] = [10, 13, 15, 20]`
- **Explanation:**  
  Full merged: `[1, 2, 3, 5, 8, 9, 10, 13, 15, 20]`

---

### Example 3

- **Input:**  
  `a[] = [0, 1]`  
  `b[] = [2, 3]`
- **Output:**  
  `a[] = [0, 1]`  
  `b[] = [2, 3]`
- **Explanation:**  
  Already sorted, no need for changes.

---

## Constraints

- `1 ≤ a.length, b.length ≤ 10⁵`
- `0 ≤ a[i], b[i] ≤ 10⁷`
- Time Complexity target: **O((n + m) log(n + m))**
- Space Complexity: **O(1)** (in-place)

---

## Optimal Approach – Gap Algorithm (Shell Sort Inspired)

### Steps:

1. Use a **gap** initialized as `ceil((n + m) / 2)`.
2. Compare and swap elements across both arrays with the defined gap.
3. Reduce the gap until it becomes 0.

---
