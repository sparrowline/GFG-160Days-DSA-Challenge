# Longest Substring with All Distinct Characters

## Problem Statement

Given a string `s`, find the **length of the longest contiguous substring** such that all characters of the substring are **unique (no duplicates)**.

---

## Examples

### Example 1
- **Input:**  
  `s = "geeksforgeeks"`
- **Output:**  
  `7`
- **Explanation:**  
  Longest substring with all distinct characters is `"eksforg"`.

---

### Example 2
- **Input:**  
  `s = "aaa"`
- **Output:**  
  `1`
- **Explanation:**  
  Longest substring is `"a"`.

---

### Example 3
- **Input:**  
  `s = "abcdefabcbb"`
- **Output:**  
  `6`
- **Explanation:**  
  Longest substring with distinct characters is `"abcdef"`.

---

## Constraints

- `1 <= s.length <= 3 * 10^4`
- All characters in `s` are lowercase English alphabets (`'a'` to `'z'`)

---

## Approach – Sliding Window with HashMap

### Method

1. Use a **sliding window** with two pointers `left` and `right`.
2. Maintain a `Map<Character, Integer>` to track the last seen index of each character.
3. As you expand `right`, if a character repeats, **slide the `left` pointer** to the right of the previous index of that character.
4. Calculate the window size as `right - left + 1` and update `maxLength`.

---

## Optimized Java Code (O(n))

```java
import java.util.*;

public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastSeen.containsKey(c)) {
                // Slide left to the right of the last seen index of c
                left = Math.max(left, lastSeen.get(c) + 1);
            }

            lastSeen.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}