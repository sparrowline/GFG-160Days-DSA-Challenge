# Inversion Count in an Array

## Problem Statement

Given an array of integers `arr[]`, the task is to find the **Inversion Count** in the array.

Two elements `arr[i]` and `arr[j]` form an **inversion** if `arr[i] > arr[j]` and `i < j`.

---

## Definition

- **Inversion Count** measures how far the array is from being sorted.
- A sorted array has **0** inversions.
- A reverse sorted array has the **maximum** number of inversions.

---

## Examples

### Example 1
- **Input:**  
  `arr[] = [2, 4, 1, 3, 5]`
- **Output:**  
  `3`
- **Explanation:**  
  Inversions are: (2,1), (4,1), (4,3)

---

### Example 2
- **Input:**  
  `arr[] = [2, 3, 4, 5, 6]`
- **Output:**  
  `0`
- **Explanation:**  
  The array is already sorted, so no inversions.

---

### Example 3
- **Input:**  
  `arr[] = [10, 10, 10]`
- **Output:**  
  `0`
- **Explanation:**  
  All elements are equal, so no inversions.

---

## Constraints

- `1 ≤ arr.length ≤ 10^5`  
- `1 ≤ arr[i] ≤ 10^4`

---

## Optimal Approach

This problem can be efficiently solved using **Merge Sort** with a time complexity of **O(n log n)**.

---
