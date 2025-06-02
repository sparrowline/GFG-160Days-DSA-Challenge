# Closest Pair to Target Sum with Constraints

## Problem Statement

Given an array `arr[]` of integers and a number `target`, your task is to find **a pair** `(a, b)` in the array such that:

- `a <= b`
- The **sum** `a + b` is **closest to the target**
- If multiple such pairs exist:
  - Return the pair with the **maximum absolute difference** (`|a - b|`)
- If **no such pair exists** (e.g., only one element), return an **empty array**

Return the pair in **sorted order** as `[a, b]`.

---

## Examples

### Example 1

- **Input:**  
  `arr = [10, 30, 20, 5], target = 25`
- **Output:**  
  `[5, 20]`
- **Explanation:**  
  `5 + 20 = 25` which exactly equals the target.

---

### Example 2

- **Input:**  
  `arr = [5, 2, 7, 1, 4], target = 10`
- **Output:**  
  `[2, 7]`
- **Explanation:**  
  Both `[4, 7]` and `[2, 7]` sum to 11 (closest to 10).  
  But `[2, 7]` has a greater absolute difference (5 > 3).

---

### Example 3

- **Input:**  
  `arr = [10], target = 10`
- **Output:**  
  `[]`
- **Explanation:**  
  Only one element is present. No pair can be formed.

---

## Constraints

- `1 ≤ arr.length ≤ 2 * 10^5`
- `0 ≤ arr[i] ≤ 10^5`
- `0 ≤ target ≤ 2 * 10^5`

---

## Approach – Two Pointers with Sorting

### Method

1. **Sort** the array.
2. Use **two pointers** (`left`, `right`) initialized at the start and end of the array.
3. For each pair `(arr[left], arr[right])`:
   - Check if their sum is closer to the target than the best so far.
   - If equal distance, pick the pair with the **maximum absolute difference**.
4. Move the pointers based on how the current sum compares to the target.

---

## Optimized Java Implementation (O(n log n))

```java
import java.util.Arrays;

public class ClosestPairToTargetSum {
    public int[] findClosestPair(int[] arr, int target) {
        if (arr == null || arr.length < 2) return new int[0];

        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int maxAbsDiff = Integer.MIN_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);
            int absDiff = Math.abs(arr[right] - arr[left]);

            if (diff < minDiff || (diff == minDiff && absDiff > maxAbsDiff)) {
                result[0] = arr[left];
                result[1] = arr[right];
                minDiff = diff;
                maxAbsDiff = absDiff;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}