# Count Subarrays with Sum Equal to K

## Problem Statement

Given an unsorted integer array `arr[]`, the task is to find the number of **contiguous subarrays** whose sum is exactly equal to a given integer `k`.

---

## Examples

### Example 1
- **Input:**  
  `arr = [10, 2, -2, -20, 10], k = -10`
- **Output:**  
  `3`
- **Explanation:**  
  The subarrays with sum = -10 are:  
  - `arr[0...3]` → 10 + 2 + (-2) + (-20) = -10  
  - `arr[1...4]` → 2 + (-2) + (-20) + 10 = -10  
  - `arr[3...4]` → -20 + 10 = -10

---

### Example 2
- **Input:**  
  `arr = [9, 4, 20, 3, 10, 5], k = 33`
- **Output:**  
  `2`
- **Explanation:**  
  Subarrays:
  - `arr[0...2]` → 9 + 4 + 20 = 33  
  - `arr[2...4]` → 20 + 3 + 10 = 33

---

### Example 3
- **Input:**  
  `arr = [1, 3, 5], k = 0`
- **Output:**  
  `0`
- **Explanation:**  
  No subarray has sum equal to 0.

---

## Constraints

- `1 ≤ arr.length ≤ 10^5`
- `-10^3 ≤ arr[i] ≤ 10^3`
- `-10^7 ≤ k ≤ 10^7`

---

## Approach – Prefix Sum + HashMap (Efficient)

### Method

1. Use a prefix sum to store cumulative sum up to current index.
2. Use a `HashMap` to store how many times a particular prefix sum has occurred.
3. At each index `i`, check if `prefix_sum - k` exists in the map.  
   This tells us how many subarrays ended at index `i` with sum equal to `k`.

---

## Java Implementation

```java
import java.util.*;

public class SubarraySumEqualsK {
    public int countSubarrays(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, count = 0;

        map.put(0, 1); // base case: one way to get sum 0 before starting

        for (int num : arr) {
            prefixSum += num;

            // Check if there is a prefixSum - k
            count += map.getOrDefault(prefixSum - k, 0);

            // Store current prefixSum in map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}