# Kth Missing Positive Number in a Sorted Array

## Problem Statement

You are given a **sorted array of distinct positive integers** `arr[]`. Your task is to determine the **kth positive integer** that is **missing** from this array.

---

## Examples

### Example 1

- **Input:** `arr = [2, 3, 4, 7, 11]`, `k = 5`  
- **Output:** `9`  
- **Explanation:** Missing numbers are `[1, 5, 6, 8, 9, 10, …]`. The 5th missing number is `9`.

---

### Example 2

- **Input:** `arr = [1, 2, 3]`, `k = 2`  
- **Output:** `5`  
- **Explanation:** Missing numbers are `[4, 5, 6, …]`. The 2nd missing number is `5`.

---

### Example 3

- **Input:** `arr = [3, 5, 9, 10, 11, 12]`, `k = 2`  
- **Output:** `2`  
- **Explanation:** Missing numbers are `[1, 2, 4, 6, 7, 8, …]`. The 2nd missing number is `2`.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁵`
- `1 ≤ k ≤ 10⁵`
- `1 ≤ arr[i] ≤ 10⁶`
- `arr[i]` is strictly increasing

---

## Optimal Approach – Binary Search (O(log n) Time)

### Key Insight

At index `i`, the count of missing numbers before `arr[i]` is:

```math
missing = arr[i] - (i + 1)