# Count Pairs with Given Sum

## Problem Statement

Given an integer array `arr[]` and an integer `target`, **count the number of pairs** `(i, j)` such that:  
`arr[i] + arr[j] == target`  
and `i < j`.

---

## Examples

### Example 1
- **Input:**  
  `arr = [1, 5, 7, -1, 5]`, `target = 6`
- **Output:** `3`
- **Explanation:** Valid pairs with sum = 6: `(1,5)`, `(7,-1)`, `(1,5)` (two 5s give two different pairs).

---

### Example 2
- **Input:**  
  `arr = [1, 1, 1, 1]`, `target = 2`
- **Output:** `6`
- **Explanation:** All pairs of 1s add up to 2. Total number of pairs = 4C2 = 6.

---

### Example 3
- **Input:**  
  `arr = [10, 12, 10, 15, -1]`, `target = 125`
- **Output:** `0`
- **Explanation:** No pair has sum = 125.

---

## Constraints

- `1 ≤ arr.length ≤ 10^5`
- `-10^4 ≤ arr[i] ≤ 10^4`
- `1 ≤ target ≤ 10^4`

---

## Approach – Using HashMap (Optimal – O(n) Time, O(n) Space)

### Method

1. Use a `HashMap<Integer, Integer>` to store the frequency of elements.
2. Initialize `count = 0`
3. Iterate through `arr[]`:
   - For each `num`, find its complement: `target - num`
   - If `complement` exists in the map, add its frequency to `count`
   - Add/update frequency of `num` in the map
4. Return `count`

---

## Java Implementation

```java
import java.util.HashMap;

public class CountPairsWithSum {

    public int getPairsCount(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            // If complement is already in map, increment count
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            // Add/update current number's frequency
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}