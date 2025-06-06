# Count Distinct Elements in Every Window of Size K

## Problem Statement

Given an integer array `arr[]` and a number `k`, your task is to **find the count of distinct elements** in **every contiguous subarray (window) of size `k`**.

---

## Examples

### Example 1

- **Input:**  
  `arr = [1, 2, 1, 3, 4, 2, 3], k = 4`
- **Output:**  
  `[3, 4, 4, 3]`
- **Explanation:**  
  - Window 1 → `[1, 2, 1, 3]` → Distinct = 3  
  - Window 2 → `[2, 1, 3, 4]` → Distinct = 4  
  - Window 3 → `[1, 3, 4, 2]` → Distinct = 4  
  - Window 4 → `[3, 4, 2, 3]` → Distinct = 3  

---

### Example 2

- **Input:**  
  `arr = [4, 1, 1], k = 2`
- **Output:**  
  `[2, 1]`

---

### Example 3

- **Input:**  
  `arr = [1, 1, 1, 1, 1], k = 3`
- **Output:**  
  `[1, 1, 1]`

---

## Constraints

- `1 <= k <= arr.length <= 10^5`
- `1 <= arr[i] <= 10^5`

---

## Approach – Sliding Window with HashMap

### Method

1. Use a `HashMap<Integer, Integer>` to store the frequency of each element in the current window.
2. Initialize the first window (`0 to k-1`) and populate the map with frequencies.
3. Slide the window one element at a time:
   - Decrease frequency of the outgoing element (`i - k`)
   - If frequency becomes zero, remove it
   - Add the new element (`i`)
   - Store the size of the map (number of unique elements) in the result

This approach ensures efficient `O(n)` time using amortized hashmap operations.

---

## Optimized Java Implementation (O(n))

```java
import java.util.*;

public class DistinctElementsInWindow {
    public List<Integer> countDistinct(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the map
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);

            // Remove the element left out of window
            if (i >= k) {
                int outElement = arr[i - k];
                freqMap.put(outElement, freqMap.get(outElement) - 1);
                if (freqMap.get(outElement) == 0) {
                    freqMap.remove(outElement);
                }
            }

            // Add result only after first window
            if (i >= k - 1) {
                result.add(freqMap.size());
            }
        }

        return result;
    }
}