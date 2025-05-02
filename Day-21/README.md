# Sort an Array of 0s, 1s, and 2s (Dutch National Flag Problem)

## Problem Statement

Given an array `arr[]` containing only 0s, 1s, and 2s, **sort the array in ascending order**.

> You must **not use any built-in sort function**.

---

## Examples

### Example 1
- **Input:**  
  `arr[] = [0, 1, 2, 0, 1, 2]`
- **Output:**  
  `[0, 0, 1, 1, 2, 2]`
- **Explanation:**  
  All 0s, 1s, and 2s are sorted in ascending order.

---

### Example 2
- **Input:**  
  `arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]`
- **Output:**  
  `[0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]`
- **Explanation:**  
  All 0s, 1s, and 2s are sorted in ascending order.

---

## Constraints

- `1 <= arr.length <= 10^6`  
- `0 <= arr[i] <= 2`

---

## Follow-up

Can you solve it in **one pass** using **constant extra space**?

---

## Optimal Approach (Dutch National Flag Algorithm)

- Use three pointers: `low`, `mid`, and `high`.
- Traverse the array once (`O(n)` time complexity).
- Keep 0s to the left, 2s to the right, and 1s in the middle.
- Requires only constant extra space.
