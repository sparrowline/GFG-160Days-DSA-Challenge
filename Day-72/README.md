# Permutations of a String

---

## Problem Statement

Given a string `s` which may contain **duplicate characters**, generate and return an array of **all unique permutations** of the string.

You may return the permutations in any order.

---

## Examples

### Example 1

**Input:**  
`s = "ABC"`  
**Output:**  
`["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]`  
**Explanation:**  
There are 6 unique permutations of the string "ABC".

---

### Example 2

**Input:**  
`s = "ABSG"`  
**Output:**  
`["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA", "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA", "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"]`  
**Explanation:**  
24 unique permutations for "ABSG".

---

### Example 3

**Input:**  
`s = "AAA"`  
**Output:**  
`["AAA"]`  
**Explanation:**  
Only one unique permutation since all characters are the same.

---

## Constraints

- `1 <= s.length <= 9`
- `s` contains only **uppercase English alphabets**

---

## Java Implementation

```java
import java.util.*;

public class Solution {
    public List<String> findPermutations(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // sort to handle duplicates
        boolean[] used = new boolean[s.length()];
        backtrack(result, new StringBuilder(), chars, used);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb, char[] chars, boolean[] used) {
        if (sb.length() == chars.length) {
            result.add(sb.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            // Skip used characters or duplicates (only take the first duplicate in each level)
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) continue;

            sb.append(chars[i]);
            used[i] = true;
            backtrack(result, sb, chars, used);
            used[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}