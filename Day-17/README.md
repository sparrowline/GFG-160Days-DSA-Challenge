## Problem: First Non-Repeating Character

### Problem Statement
Given a string `s` consisting of lowercase English letters, return the first non-repeating character in `s`.  
If there is no non-repeating character, return `'$'`.  
Note: When you return `'$'`, the driver code will output `-1`.

### Input:
- `s` (1 ≤ s.size() ≤ 10^5): A string consisting of lowercase English letters.

### Output:
- A character if there is a non-repeating character.
- `'$'` if there is no non-repeating character.

### Example 1:
**Input**:  
`"geeksforgeeks"`

**Output**:  
`'f'`

**Explanation**:  
In the given string, 'f' is the first character which does not repeat.

### Example 2:
**Input**:  
`"racecar"`

**Output**:  
`'e'`

**Explanation**:  
In the given string, 'e' is the only character that does not repeat.

### Example 3:
**Input**:  
`"aabbccc"`

**Output**:  
`-1`

**Explanation**:  
All the characters in the given string are repeating.

---

### Approach:

1. **Use a Hash Map (Frequency Count):**  
   - Traverse the string and count the frequency of each character.
   
2. **Identify the First Non-Repeating Character:**  
   - Traverse the string again to check the first character with a frequency of 1.
   - If such a character is found, return it. Otherwise, return `'$'`.

