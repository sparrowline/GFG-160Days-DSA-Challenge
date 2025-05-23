# Two Sum – Pair with Given Sum

## Problem Statement

Given an array `arr[]` of **positive integers** and an integer `target`, determine if there exist **two distinct indices** `i` and `j` such that:  
`arr[i] + arr[j] == target`.

Return `true` if such a pair exists, otherwise return `false`.

---

## Examples

### Example 1
- **Input:**  
  `arr = [1, 4, 45, 6, 10, 8]`, `target = 16`
- **Output:** `true`
- **Explanation:** `arr[3] + arr[4] = 6 + 10 = 16`

---

### Example 2
- **Input:**  
  `arr = [1, 2, 4, 3, 6]`, `target = 11`
- **Output:** `false`
- **Explanation:** No two elements sum up to 11.

---

### Example 3
- **Input:**  
  `arr = [11]`, `target = 11`
- **Output:** `false`
- **Explanation:** Only one element in the array, no valid pair exists.

---

## Constraints

- `1 ≤ arr.length ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^5`
- `1 ≤ target ≤ 2 * 10^5`

---

## Approach – Using HashSet (Optimal - O(n) Time, O(n) Space)

### Method

1. Initialize a `HashSet` to keep track of elements seen so far.
2. For each element `num` in `arr[]`:
   - Compute `complement = target - num`
   - If `complement` is already in the `set`, return `true`.
   - Otherwise, add `num` to the set.
3. If no such pair is found, return `false`.

---

## Java Implementation

```java
import java.util.HashSet;

public class TwoSum {

    public boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}