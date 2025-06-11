# Longest Subarray with Given Sum (K)

## Problem Statement

Given an array of integers `arr[]` and an integer `k`, the task is to find the **length of the longest subarray** whose **sum is equal to `k`**.

> If no such subarray exists, return `0`.

---

## Examples

### Example 1
- **Input:**  
  `arr[] = [10, 5, 2, 7, 1, -10]`, `k = 15`  
- **Output:**  
  `6`  
- **Explanation:**  
  Subarrays with sum = 15 are:  
  - `[10, 5]`  
  - `[5, 2, 7, 1]`  
  - `[10, 5, 2, 7, 1, -10]`  
  The longest has length = **6**.

---

### Example 2
- **Input:**  
  `arr[] = [-5, 8, -14, 2, 4, 12]`, `k = -5`  
- **Output:**  
  `5`  
- **Explanation:**  
  Subarray `[-5, 8, -14, 2, 4]` sums to -5, and has length = **5**.

---

### Example 3
- **Input:**  
  `arr[] = [10, -10, 20, 30]`, `k = 5`  
- **Output:**  
  `0`  
- **Explanation:**  
  No subarray found with sum = 5.

---

## Constraints

- `1 <= arr.length <= 10^5`  
- `-10^4 <= arr[i] <= 10^4`  
- `-10^9 <= k <= 10^9`

---

## Optimal Approach – Prefix Sum with HashMap

### Strategy

1. Use a HashMap to store the **first occurrence of a cumulative sum**.
2. For each index, calculate the **current sum**.
3. If `(current sum - k)` exists in the map, calculate the subarray length.
4. Track the maximum length found.
5. Also check if the current sum itself equals `k`.

---

## Java Implementation

```java
import java.util.HashMap;

public class LongestSubarraySumK {
    public int longestSubarrayWithSumK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0, maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(currentSum - k)) {
                int length = i - map.get(currentSum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store the first occurrence of currentSum
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        return maxLength;
    }
}