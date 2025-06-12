# Longest Subarray with Equal Number of 0s and 1s

## Problem Statement

Given a binary array `arr[]` consisting only of **0s and 1s**, the objective is to **find the length of the longest contiguous subarray** that contains **equal number of 0s and 1s**.

> If no such subarray exists, return `0`.

---

## Examples

### Example 1
- **Input:**  
  `arr[] = [1, 0, 1, 1, 1, 0, 0]`
- **Output:**  
  `6`
- **Explanation:**  
  Subarray from index 1 to 6 → `[0, 1, 1, 1, 0, 0]` has 3 zeros and 3 ones.

---

### Example 2
- **Input:**  
  `arr[] = [0, 0, 1, 1, 0]`
- **Output:**  
  `4`
- **Explanation:**  
  Subarrays `[0, 0, 1, 1]` or `[0, 1, 1, 0]` both have 2 zeros and 2 ones.

---

### Example 3
- **Input:**  
  `arr[] = [0]`
- **Output:**  
  `0`
- **Explanation:**  
  No subarray has equal number of 0s and 1s.

---

## Constraints

- `1 <= arr.length <= 10^5`  
- `arr[i]` is either `0` or `1`

---

## Optimal Approach – Prefix Sum with HashMap

### Key Insight

- Convert all `0s` in the array to `-1`.
- Now, the problem reduces to finding the **longest subarray with sum = 0**.

### Algorithm

1. Traverse the array, and for each element:
   - Convert 0 to -1.
   - Maintain a **running sum**.
   - Store the **first occurrence** of each sum in a HashMap.
   - If the same sum appears again, calculate the length of subarray from first index to current.
2. Track the **maximum length** of such subarrays.

---

## Java Implementation

```java
import java.util.HashMap;

public class LongestEqual01Subarray {
    public int findMaxLength(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        map.put(0, -1); // base case

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0) ? -1 : 1;

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}