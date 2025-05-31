# Count Subarrays with XOR Equal to K

## Problem Statement

Given an array of integers `arr[]` and an integer `k`, the task is to count the number of **contiguous subarrays** such that the **XOR** of all elements in the subarray is equal to `k`.

---

## Examples

### Example 1
- **Input:**  
  `arr = [4, 2, 2, 6, 4], k = 6`
- **Output:**  
  `4`
- **Explanation:**  
  The subarrays with XOR = 6 are:  
  - `[4, 2]`  
  - `[4, 2, 2, 6, 4]`  
  - `[2, 2, 6]`  
  - `[6]`  

---

### Example 2
- **Input:**  
  `arr = [5, 6, 7, 8, 9], k = 5`
- **Output:**  
  `2`
- **Explanation:**  
  The subarrays with XOR = 5 are:  
  - `[5]`  
  - `[5, 6, 7, 8, 9]`

---

### Example 3
- **Input:**  
  `arr = [1, 1, 1, 1], k = 0`
- **Output:**  
  `4`
- **Explanation:**  
  The subarrays with XOR = 0 are:  
  - `[1, 1]` (starting at 0)  
  - `[1, 1]` (starting at 1)  
  - `[1, 1]` (starting at 2)  
  - `[1, 1, 1, 1]`  

---

## Constraints

- `1 ≤ arr.length ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^5`
- `0 ≤ k ≤ 10^5`

---

## Approach – Prefix XOR + HashMap

### Method

1. Use a prefix XOR (`xorTillNow`) to represent XOR of elements from start to current index.
2. For each index:
   - Let `xorTillNow = A ⊕ B`, then:
     - If `xorTillNow ^ k = B`, and `B` appeared before, then subarray XOR from that point gives `k`.
   - Count how many times `xorTillNow ^ k` has appeared before.
3. Use a `HashMap` to keep track of frequencies of prefix XORs.

---

## Java Implementation

```java
import java.util.*;

public class CountSubarraysWithXor {
    public int countSubarrays(int[] arr, int k) {
        Map<Integer, Integer> xorCount = new HashMap<>();
        int xorTillNow = 0;
        int count = 0;

        for (int num : arr) {
            xorTillNow ^= num;

            if (xorTillNow == k)
                count++;

            int requiredXor = xorTillNow ^ k;
            count += xorCount.getOrDefault(requiredXor, 0);

            xorCount.put(xorTillNow, xorCount.getOrDefault(xorTillNow, 0) + 1);
        }

        return count;
    }
}