# Find the K-th Element in Two Sorted Arrays

## Problem Statement

You are given two **sorted arrays** `a[]` and `b[]`, and an integer `k`.  
Your task is to find the element that would appear at the **k-th position** (1-based) in the **merged sorted array** formed by combining both arrays.

---

## Examples

### Example 1

- **Input:**  
  `a = [2, 3, 6, 7, 9]`  
  `b = [1, 4, 8, 10]`  
  `k = 5`  
- **Output:**  
  `6`  
- **Explanation:**  
  Merged array = `[1, 2, 3, 4, 6, 7, 8, 9, 10]` → 5th element is `6`.

---

### Example 2

- **Input:**  
  `a = [100, 112, 256, 349, 770]`  
  `b = [72, 86, 113, 119, 265, 445, 892]`  
  `k = 7`  
- **Output:**  
  `256`  
- **Explanation:**  
  Merged array = `[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]` → 7th element is `256`.

---

## Constraints

- `1 ≤ a.length, b.length ≤ 10⁶`
- `1 ≤ k ≤ a.length + b.length`
- `0 ≤ a[i], b[i] < 10⁸`

---

## Optimal Approach – Binary Search on the Shorter Array

### Key Insight:

- Use binary search on the shorter array to find a partition that satisfies:
  - `a[cut1 - 1] <= b[cut2]` and `b[cut2 - 1] <= a[cut1]`
- Here, `cut1 + cut2 = k`

### Algorithm:

1. Ensure `a` is the shorter array.
2. Use binary search between `max(0, k - m)` to `min(k, n)`:
   - `cut1 = mid` (how many elements to take from `a`)
   - `cut2 = k - cut1` (remaining from `b`)
   - Check conditions at boundaries using `Integer.MIN_VALUE` and `Integer.MAX_VALUE` where needed
3. When conditions are met, return `max(a[cut1-1], b[cut2-1])`

---
