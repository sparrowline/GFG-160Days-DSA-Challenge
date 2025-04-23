## 🌀 Maximum Circular Subarray Sum

**Problem Statement:**

Given an array of integers `arr[]` in a circular fashion, find the **maximum subarray sum** that we can get if we assume the array to be circular.

---

### 🧪 Examples:

#### Example 1:
**Input:**  
`arr[] = [8, -8, 9, -9, 10, -11, 12]`  
**Output:**  
`22`  
**Explanation:**  
Starting from the last element `12` and moving in a circular fashion,  
we have subarray: `12, 8, -8, 9, -9, 10`  
Sum = `22`

---

#### Example 2:
**Input:**  
`arr[] = [10, -3, -4, 7, 6, 5, -4, -1]`  
**Output:**  
`23`  
**Explanation:**  
The subarray is `[7, 6, 5, -4, -1, 10]`  
Sum = `23`

---

#### Example 3:
**Input:**  
`arr[] = [-1, 40, -14, 7, 6, 5, -4, -1]`  
**Output:**  
`52`  
**Explanation:**  
Circular subarray `[7, 6, 5, -4, -1, -1, 40]` has max sum = `52`

---

### ✅ Constraints:
- `1 <= arr.size() <= 10^5`
- `-10^4 <= arr[i] <= 10^4`

---

**Note:**  
This is a variation of the [Kadane's Algorithm](https://en.wikipedia.org/wiki/Maximum_subarray_problem) problem. You may consider both normal and circular subarrays to get the final result.