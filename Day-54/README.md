# Count Number of Valid Triangles

## Problem Statement

You are given an **integer array** `arr[]`. Your task is to **count the number of valid triangles** that can be formed using **three distinct elements** from the array as the lengths of the sides.

A **valid triangle** satisfies the **triangle inequality**:

> For any 3 sides `a`, `b`, and `c`, a triangle is valid **iff**  
> `a + b > c`, `b + c > a`, and `a + c > b`  
> When the array is **sorted**, it reduces to:  
> **If `arr[i] + arr[j] > arr[k]`**, where `i < j < k`, then it forms a triangle.

---

## Examples

### Example 1

- **Input:**  
  `arr = [4, 6, 3, 7]`
- **Output:**  
  `3`
- **Explanation:**  
  Valid triangles: `[3, 4, 6]`, `[4, 6, 7]`, `[3, 6, 7]`

---

### Example 2

- **Input:**  
  `arr = [10, 21, 22, 100, 101, 200, 300]`
- **Output:**  
  `6`
- **Explanation:**  
  Valid triangles:  
  `[10, 21, 22]`, `[10, 100, 101]`, `[21, 100, 101]`,  
  `[22, 100, 101]`, `[100, 101, 200]`, `[101, 200, 300]`

---

### Example 3

- **Input:**  
  `arr = [1, 2, 3]`
- **Output:**  
  `0`
- **Explanation:**  
  No valid triangle can be formed.

---

## Constraints

- `1 <= arr.length <= 10^3`
- `0 <= arr[i] <= 10^5`

---

## Approach – Two Pointer after Sorting

### Method

1. Sort the array.
2. Fix the third side (largest side) as `k` from `n-1` to `2`
3. Use two pointers `i = 0`, `j = k - 1` to find all valid combinations:
   - If `arr[i] + arr[j] > arr[k]` → all elements from `i` to `j-1` will also satisfy the condition.
     - Count = `j - i`
     - Move `j--`
   - Else → move `i++`

---

## Optimized Java Implementation (O(n²))

```java
import java.util.Arrays;

public class ValidTriangleCounter {
    public int countTriangles(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length, count = 0;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
    }
}