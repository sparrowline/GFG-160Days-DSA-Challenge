# 🧮 String to Integer (Atoi)

## Problem Statement

Given a string `s`, the objective is to convert it into **integer format** without utilizing any built-in functions. Refer to the steps below to understand the `atoi()` function.

---

## Rules for Atoi Conversion

1. **Skip any leading whitespaces.**
2. **Check for a sign** (‘+’ or ‘−’), default to **positive** if no sign is present.
3. **Read the integer** by ignoring leading zeros until:
   - A non-digit character is encountered, or
   - The end of the string is reached.
4. If **no digits** are present, return `0`.
5. If the integer is **greater than `2^31 - 1`**, return `2^31 - 1`.
6. If the integer is **less than `-2^31`**, return `-2^31`.

---

## Examples

### Example 1
**Input:**  
`s = "-123"`  
**Output:**  
`-123`  
**Explanation:**  
It is possible to convert `-123` into an integer, so we return it.

---

### Example 2  
**Input:**  
`s = "  -"`  
**Output:**  
`0`  
**Explanation:**  
No digits are present, so the result is `0`.

---

### Example 3  
**Input:**  
`s = " 1231231231311133"`  
**Output:**  
`2147483647`  
**Explanation:**  
The converted number exceeds `2^31 - 1`, so return `2147483647`.

---

### Example 4  
**Input:**  
`s = "-999999999999"`  
**Output:**  
`-2147483648`  
**Explanation:**  
The converted number is below `-2^31`, so return `-2147483648`.

---

### Example 5  
**Input:**  
`s = "  -0012gfg4"`  
**Output:**  
`-12`  
**Explanation:**  
Only `-0012` is parsed before the invalid character `g`.

---

## Constraints

- `1 ≤ |s| ≤ 15`