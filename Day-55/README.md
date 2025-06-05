# Subarray with Given Sum

## Problem Statement

You are given a **non-negative integer array** `arr[]` and a **target sum**.  
Your task is to **find the first continuous subarray** (i.e., a contiguous sequence of elements) whose sum equals the target.  
You must return the **1-based indices** `[start, end]` of this subarray.  
If no such subarray exists, return `[-1]`.

---

## Examples

### Example 1

- **Input:**  
  `arr = [1, 2, 3, 7, 5], target = 12`
- **Output:**  
  `[2, 4]`
- **Explanation:**  
  Subarray `[2, 3, 7]` from index 2 to 4 has sum 12.

---

### Example 2

- **Input:**  
  `arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15`
- **Output:**  
  `[1, 5]`
- **Explanation:**  
  Subarray `[1, 2, 3, 4, 5]` from index 1 to 5 has sum 15.

---

### Example 3

- **Input:**  
  `arr = [5, 3, 4], target = 2`
- **Output:**  
  `[-1]`
- **Explanation:**  
  No subarray sums to 2.

---

## Constraints

- `1 <= arr.length <= 10^6`
- `0 <= arr[i] <= 10^3`
- `0 <= target <= 10^9`

---

## Approach – Sliding Window Technique

### Method

1. Initialize two pointers: `start = 0`, `end = 0`
2. Maintain a `currentSum = 0`
3. Loop over the array:
   - Add `arr[end]` to `currentSum`
   - While `currentSum > target`, subtract `arr[start]` and move `start++`
   - If `currentSum == target`, return `[start + 1, end + 1]` (1-based indexing)
4. If the loop finishes with no match, return `[-1]`

This technique is efficient because:
- All array elements are non-negative, so once the sum exceeds the target, moving the left pointer reduces the sum.

---

## Optimized Java Implementation (O(n))

```java
public class SubarrayWithGivenSum {
    public int[] findSubarray(int[] arr, int target) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start < end) {
                sum -= arr[start++];
            }

            if (sum == target) {
                return new int[] { start + 1, end + 1 }; // 1-based index
            }
        }

        return new int[] { -1 };
    }
}