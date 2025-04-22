# 📘 Problem: Maximum Sum Subarray (Kadane’s Algorithm)

Given an integer array `arr[]`, you need to find the **maximum sum of a subarray**.

---

## 🧠 Examples

### Example 1:
**Input:**  
`arr[] = [2, 3, -8, 7, -1, 2, 3]`  
**Output:**  
`11`  
**Explanation:**  
The subarray `{7, -1, 2, 3}` has the largest sum `11`.

---

### Example 2:
**Input:**  
`arr[] = [-2, -4]`  
**Output:**  
`-2`  
**Explanation:**  
The subarray `{-2}` has the largest sum `-2`.

---

### Example 3:
**Input:**  
`arr[] = [5, 4, 1, 7, 8]`  
**Output:**  
`25`  
**Explanation:**  
The subarray `{5, 4, 1, 7, 8}` has the largest sum `25`.

---

## ✅ Constraints
- `1 ≤ arr.length ≤ 10⁵`
- `-10⁹ ≤ arr[i] ≤ 10⁴`

---

## 💡 Tip
This problem is best solved using **Kadane's Algorithm**, which runs in `O(n)` time.