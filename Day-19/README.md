# Minimum Characters to Add to Make String Palindrome

## Problem Statement

Given a string `s`, the task is to **find the minimum number of characters to be added at the front** of the string to make it a **palindrome**.

> **Note:** A palindrome is a sequence of characters that reads the same **forward and backward**.

---

## Examples

### Example 1
- **Input:**  
  `s = "abc"`
- **Output:**  
  `2`
- **Explanation:**  
  Add `'b'` and `'c'` at the front of the string to make it a palindrome: `"cbabc"`

---

### Example 2
- **Input:**  
  `s = "aacecaaaa"`
- **Output:**  
  `2`
- **Explanation:**  
  Add two `'a'` characters at the front to make it a palindrome: `"aaaacecaaaa"`

---

## Constraints

- `1 <= s.length() <= 10^6`

---

## Approach

This problem can be optimally solved using a **KMP-based technique**.  
By building the **LPS (Longest Prefix Suffix)** array for the string:  
`combined = s + "$" + reverse(s)`  
We can determine the longest palindromic prefix, and the minimum characters to add will be:  
`length of s - length of longest palindromic prefix`.

This approach ensures a time complexity of **O(n)** and is efficient for large inputs.