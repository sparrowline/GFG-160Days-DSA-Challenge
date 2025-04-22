# 🏰 Problem: Minimize the Height Difference of Towers

You are given an array `arr[]` representing the heights of `N` towers and a positive integer `K`.

For **each tower**, you must **perform exactly one** of the following operations:

- Increase the height by **K**
- Decrease the height by **K**

Your task is to find the **minimum possible difference** between the height of the **shortest** and **tallest** towers after performing the above operations on each tower.

---

> 📌 **Note:**
- Each tower must undergo **exactly one** operation.
- The resulting height must **not be negative**.

---

## 🧠 Examples

### Example 1:
**Input:**  
`k = 2`, `arr[] = [1, 5, 8, 10]`  
**Output:**  
`5`  
**Explanation:**  
We can modify the array as:  
`[1+2, 5-2, 8-2, 10-2] → [3, 3, 6, 8]`  
Max difference = `8 - 3 = 5`.

---

### Example 2:
**Input:**  
`k = 3`, `arr[] = [3, 9, 12, 16, 20]`  
**Output:**  
`11`  
**Explanation:**  
Modified array:  
`[3+3, 9+3, 12-3, 16-3, 20-3] → [6, 12, 9, 13, 17]`  
Max difference = `17 - 6 = 11`.

---

## ✅ Constraints

- `1 ≤ k ≤ 10⁷`  
- `1 ≤ n ≤ 10⁵`  
- `1 ≤ arr[i] ≤ 10⁷`

---

## 💡 Approach

1. **Sort** the array to analyze the differences more easily.
2. Consider the smallest element as increased by `K` and the largest as decreased by `K`.
3. Loop through the array and try to minimize the difference by modifying intermediate values appropriately.
4. Skip any modification that results in a **negative height**.

---

## 📌 Use Case

This is a classic **Greedy + Sorting** based problem, often asked to test your ability to transform arrays with conditional logic to minimize a range.