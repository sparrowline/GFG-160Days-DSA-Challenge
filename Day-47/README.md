# Longest Consecutive Subsequence (Unordered)

## Problem Statement

Given an array `arr[]` of **non-negative integers**, find the **length of the longest subsequence** such that the elements in the subsequence are **consecutive integers**.  
**Order does not matter**.

---

## Examples

### Example 1
- **Input:**  
  `arr = [2, 6, 1, 9, 4, 5, 3]`  
- **Output:** `6`  
- **Explanation:** Consecutive sequence = {1, 2, 3, 4, 5, 6}

---

### Example 2
- **Input:**  
  `arr = [1, 9, 3, 10, 4, 20, 2]`  
- **Output:** `4`  
- **Explanation:** Consecutive sequence = {1, 2, 3, 4}

---

### Example 3
- **Input:**  
  `arr = [15, 13, 12, 14, 11, 10, 9]`  
- **Output:** `7`  
- **Explanation:** Consecutive sequence = {9, 10, 11, 12, 13, 14, 15}

---

## Constraints

- `1 ≤ arr.length ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^5`

---

## Approach – HashSet (Optimal)

### Method

1. Insert all elements into a `HashSet` for O(1) access.
2. Iterate over each element:
   - For each number `num`, check if it is the **start of a sequence** (i.e., `num - 1` not in the set).
   - If yes, count how many consecutive numbers follow.
3. Track the **maximum count**.

---

## Java Implementation

```java
import java.util.*;

public class LongestConsecutiveSubsequence {

    public int findLongestConsecutiveSubsequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {
            // Only start counting if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}