# Search in a Sorted and Rotated Array

## Problem Statement

You are given a **sorted and rotated array** `arr[]` consisting of **distinct integers**.  
Your task is to **find the index of a given key**.  
Return `-1` if the key is not found in the array.

---

## Examples

### Example 1

- **Input:**  
  `arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3]`, `key = 3`  
- **Output:**  
  `8`  
- **Explanation:**  
  `3` is located at index `8`.

---

### Example 2

- **Input:**  
  `arr[] = [3, 5, 1, 2]`, `key = 6`  
- **Output:**  
  `-1`  
- **Explanation:**  
  Key is not present in the array.

---

### Example 3

- **Input:**  
  `arr[] = [33, 42, 72, 99]`, `key = 42`  
- **Output:**  
  `1`  
- **Explanation:**  
  The key is found at index `1`.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁶`
- `0 ≤ arr[i] ≤ 10⁶`
- `1 ≤ key ≤ 10⁶`
- All elements are **distinct**
- The array is **sorted and rotated**

---

## Optimal Approach – Modified Binary Search

### Key Insight:
Even after rotation, one half of the array is **always sorted**.  
You can use this property to apply binary search efficiently.

### Algorithm:

1. Initialize `low = 0`, `high = arr.length - 1`
2. While `low <= high`:
   - Compute `mid = (low + high) / 2`
   - If `arr[mid] == key`, return `mid`
   - If `arr[low] <= arr[mid]` (left half is sorted):
     - If `arr[low] <= key < arr[mid]`, search in the left half
     - Else, search in the right half
   - Else (right half is sorted):
     - If `arr[mid] < key <= arr[high]`, search in the right half
     - Else, search in the left half

---
