# Find the Minimum Element in a Rotated Sorted Array

## Problem Statement

You are given a **sorted array of distinct elements** `arr[]` that has been **rotated at some unknown pivot**.  
Your task is to find the **minimum element** in the array.

---

## Examples

### Example 1

- **Input:**  
  `arr[] = [5, 6, 1, 2, 3, 4]`  
- **Output:**  
  `1`  
- **Explanation:**  
  The array was rotated at index 2. The minimum element is `1`.

---

### Example 2

- **Input:**  
  `arr[] = [3, 1, 2]`  
- **Output:**  
  `1`  
- **Explanation:**  
  The smallest element appears at the pivot after rotation.

---

### Example 3

- **Input:**  
  `arr[] = [4, 2, 3]`  
- **Output:**  
  `2`  
- **Explanation:**  
  Rotation caused `2` to appear before `3` and `4`.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁶`
- `1 ≤ arr[i] ≤ 10⁹`
- All elements are **distinct**
- Array is a **rotated sorted array**

---

## Optimal Approach – Modified Binary Search

### Key Insight:
In a rotated sorted array, the **minimum element** is the **only element whose previous is greater**, and it marks the rotation point.

### Algorithm:

- If the array is already sorted (no rotation), return `arr[0]`
- Use **binary search**:
  - If `arr[mid] >= arr[low]`, search in the right half.
  - Else, search in the left half (as the minimum is to the left or at mid).

---