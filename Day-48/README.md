# Group Anagrams from an Array of Strings

## Problem Statement

Given an array of strings `arr[]`, return all groups of strings that are **anagrams**.  
Each group must preserve the **original order of appearance** of strings in the input array.

---

## Examples

### Example 1
- **Input:**  
  `arr = ["act", "god", "cat", "dog", "tac"]`
- **Output:**  
  `[[act, cat, tac], [god, dog]]`
- **Explanation:**  
  - Group 1: "act", "cat", and "tac" are anagrams.  
  - Group 2: "god" and "dog" are anagrams.

---

### Example 2
- **Input:**  
  `arr = ["no", "on", "is"]`
- **Output:**  
  `[[is], [no, on]]`
- **Explanation:**  
  - Group 1: "is" has no anagram.  
  - Group 2: "no" and "on" are anagrams.

---

### Example 3
- **Input:**  
  `arr = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]`
- **Output:**  
  `[[listen, silent, enlist], [abc, cab, bac], [rat, tar, art]]`
- **Explanation:**  
  - Group 1: "listen", "silent", "enlist"  
  - Group 2: "abc", "cab", "bac"  
  - Group 3: "rat", "tar", "art"

---

## Constraints

- `1 ≤ arr.length ≤ 10^5`
- `1 ≤ arr[i].length ≤ 100`
- Strings contain lowercase English letters only

---

## Approach – HashMap with Sorted Key

### Method

1. Initialize a `LinkedHashMap<String, List<String>>` to maintain insertion order of groups.
2. For each word:
   - Sort its characters and use it as a **key**.
   - Insert original word into the list mapped to the sorted key.
3. Return all values from the map.

---

## Java Implementation

```java
import java.util.*;

public class AnagramGroups {
    public List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> map = new LinkedHashMap<>();

        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}