# Find Peak Element in an Array

## Problem Statement

Given an array `arr[]` where **no two adjacent elements are equal**,  
find the **index of any one peak element**.

An element is considered a **peak** if it is **greater than its adjacent elements** (if they exist).  
Assume the elements before the first and after the last are **negative infinity**.

Return `"true"` if the index returned by your function is a peak; otherwise, return `"false"`.

---

## Examples

### Example 1

- **Input:**  
  `arr = [1, 2, 4, 5, 7, 8, 3]`  
- **Output:**  
  `true`  
- **Explanation:**  
  `arr[5] = 8` is a peak since `arr[4] < arr[5] > arr[6]`.

---

### Example 2

- **Input:**  
  `arr = [10, 20, 15, 2, 23, 90, 80]`  
- **Output:**  
  `true`  
- **Explanation:**  
  Peaks exist at indices `1` and `5`. Both are valid answers.

---

### Example 3

- **Input:**  
  `arr = [1, 2, 3]`  
- **Output:**  
  `true`  
- **Explanation:**  
  `arr[2] = 3` is a peak as it's the last element and `arr[1] < arr[2]`.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁶`
- `-2³¹ ≤ arr[i] ≤ 2³¹ - 1`
- No two adjacent elements are the same

---

## Optimal Approach – Binary Search

### Key Insight:

Use **binary search** because:
- If `mid` is not a peak:
  - If `arr[mid] < arr[mid + 1]`, a peak must exist on the right
  - Else, a peak must exist on the left

### Algorithm:

1. Set `low = 0`, `high = arr.length - 1`
2. While `low <= high`:
   - Compute `mid = (low + high) / 2`
   - Check if `arr[mid]` is a peak:
     - If `(mid == 0 || arr[mid] > arr[mid - 1])` and `(mid == n - 1 || arr[mid] > arr[mid + 1])`, return `mid`
   - If `arr[mid] < arr[mid + 1]`, search right half
   - Else, search left half

---
