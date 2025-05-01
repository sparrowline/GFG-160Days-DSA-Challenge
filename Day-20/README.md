# Check if One String is a Rotation of Another

## Problem Statement

You are given two strings of equal length, `s1` and `s2`.  
The task is to **check if `s2` is a rotated version of `s1`**.

> **Note:** All characters in both strings are lowercase.

---

## Examples

### Example 1
- **Input:**  
  `s1 = "abcd"`, `s2 = "cdab"`
- **Output:**  
  `true`
- **Explanation:**  
  After 2 right rotations, `s1` becomes `"cdab"`, which matches `s2`.

---

### Example 2
- **Input:**  
  `s1 = "aab"`, `s2 = "aba"`
- **Output:**  
  `true`
- **Explanation:**  
  After 1 left rotation, `s1` becomes `"aba"`.

---

### Example 3
- **Input:**  
  `s1 = "abcd"`, `s2 = "acbd"`
- **Output:**  
  `false`
- **Explanation:**  
  The strings are not rotations of each other.

---

## Constraints

- `1 <= s1.length(), s2.length() <= 10^5`

---

## Approach

Concatenate `s1` with itself to form a new string:  
`combined = s1 + s1`

If `s2` is a substring of `combined`, then `s2` is a valid rotation of `s1`.  
This method runs in **O(n)** time using efficient substring search algorithms like **KMP** or built-in methods.