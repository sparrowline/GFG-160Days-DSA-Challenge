# 💥 Problem: Maximum Product Subarray

Given an array `arr[]` that contains **positive**, **negative**, and **zero** values, your task is to find the **maximum product** that can be obtained from a **subarray** of `arr[]`.

> A subarray is a contiguous part of the array.

---

## 📌 Note:
- The output is guaranteed to fit in a **32-bit integer**.

---

## 🧠 Examples

### Example 1:
**Input:**  
`arr[] = [-2, 6, -3, -10, 0, 2]`  
**Output:**  
`180`  
**Explanation:**  
The subarray with maximum product is `{6, -3, -10}`  
Product = `6 * (-3) * (-10) = 180`

---

### Example 2:
**Input:**  
`arr[] = [-1, -3, -10, 0, 6]`  
**Output:**  
`30`  
**Explanation:**  
The subarray with maximum product is `{-3, -10}`  
Product = `(-3) * (-10) = 30`

---

### Example 3:
**Input:**  
`arr[] = [2, 3, 4]`  
**Output:**  
`24`  
**Explanation:**  
All elements are positive, so the product of the entire array is the answer.

---

## ✅ Constraints

- `1 ≤ arr.size() ≤ 10⁶`  
- `-10 ≤ arr[i] ≤ 10`

---

## 💡 Hints

- Keep track of both the **maximum and minimum** product ending at the current position.
- A negative number can turn a **minimum product into a maximum**, so both should be tracked.
- Reset product when a zero is encountered.

---

## 💻 Category

This is a well-known **Dynamic Programming** problem, often tested in technical interviews to assess understanding of subarray problems and edge cases with **negative numbers and zeros**.