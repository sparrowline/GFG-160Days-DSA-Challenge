# Pattern Matching in Text (KMP Algorithm)

## Problem Statement

Given two strings, one is a **text string** `txt` and the other is a **pattern string** `pat`. The task is to **print the indexes of all the occurrences** of the pattern string in the text string.  
Use **0-based indexing** while returning the indices.  
**Note:** Return an empty list in case of no occurrences of the pattern.

---

## Examples

### Example 1
- **Input:**  
  `txt = "abcab"`, `pat = "ab"`  
- **Output:**  
  `[0, 3]`  
- **Explanation:**  
  The string `"ab"` occurs twice in `txt`, one starts at index `0` and the other at index `3`.

---

### Example 2
- **Input:**  
  `txt = "abesdu"`, `pat = "edu"`  
- **Output:**  
  `[]`  
- **Explanation:**  
  There's no substring `"edu"` present in `txt`.

---

### Example 3
- **Input:**  
  `txt = "aabaacaadaabaaba"`, `pat = "aaba"`  
- **Output:**  
  `[0, 9, 12]`  
- **Explanation:**  
  The pattern `"aaba"` occurs at indices `0`, `9`, and `12`.

---

## Constraints

- `1 ≤ txt.length() ≤ 10^6`
- `1 ≤ pat.length() < txt.length()`
- Both the strings consist of **lowercase English alphabets** only.

---

## Approach

The most optimal approach to solve this is using the **Knuth-Morris-Pratt (KMP)** pattern matching algorithm which runs in **O(n + m)** time, where `n` is the length of `txt` and `m` is the length of `pat`.

KMP avoids unnecessary re-evaluation by preprocessing the pattern into an LPS (Longest Prefix which is also Suffix) array.

---