# Count Occurrences of a Number in a Sorted Array

## Problem Statement

You are given a **sorted array** `arr[]` and a **target number** `target`.  
Your task is to **find how many times the target appears** in the array.

---

## Examples

### Example 1

- **Input:**  
  `arr[] = [1, 1, 2, 2, 2, 2, 3]`, `target = 2`  
- **Output:**  
  `4`  
- **Explanation:**  
  The number `2` appears 4 times in the array.

---

### Example 2

- **Input:**  
  `arr[] = [1, 1, 2, 2, 2, 2, 3]`, `target = 4`  
- **Output:**  
  `0`  
- **Explanation:**  
  The number `4` is not present in the array.

---

### Example 3

- **Input:**  
  `arr[] = [8, 9, 10, 12, 12, 12]`, `target = 12`  
- **Output:**  
  `3`  
- **Explanation:**  
  The number `12` appears 3 times in the array.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁶`
- `1 ≤ arr[i] ≤ 10⁶`
- `1 ≤ target ≤ 10⁶`
- Array is **sorted in non-decreasing order**

---

## Optimal Approach – Binary Search

### Key Idea:
Use **binary search** to find the **first and last occurrence** of the target.  
Count = `lastIndex - firstIndex + 1`

---
