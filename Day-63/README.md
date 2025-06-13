# Product of Array Except Self

## Problem Statement

Given an integer array `arr[]`, construct and return an output array `res[]` such that:

- `res[i]` is equal to the **product of all elements of `arr[]` except `arr[i]`**.
- **Do not** use division.
- All values in the result must fit in **32-bit integer range**.

---

## Examples

### Example 1
- **Input:**  
  `arr[] = [10, 3, 5, 6, 2]`
- **Output:**  
  `[180, 600, 360, 300, 900]`
- **Explanation:**  
  - `res[0] = 3 * 5 * 6 * 2 = 180`  
  - `res[1] = 10 * 5 * 6 * 2 = 600`  
  - `res[2] = 10 * 3 * 6 * 2 = 360`  
  - `res[3] = 10 * 3 * 5 * 2 = 300`  
  - `res[4] = 10 * 3 * 5 * 6 = 900`

---

### Example 2
- **Input:**  
  `arr[] = [12, 0]`
- **Output:**  
  `[0, 12]`
- **Explanation:**  
  - `res[0] = 0`  
  - `res[1] = 12`

---

## Constraints

- `2 <= arr.length <= 10^5`  
- `-100 <= arr[i] <= 100`

---

## Optimal Approach – Two-Pass Prefix & Suffix Product

### Core Idea

Avoid division by:
- Maintaining a **prefix product** (left of current index).
- Maintaining a **suffix product** (right of current index).
- Multiply both for final result.

---

## Java Implementation

```java
public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        int[] left = new int[n];
        int[] right = new int[n];

        // Fill left product
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        // Fill right product
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        // Multiply left and right products
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }

        return res;
    }
}