# Parenthesis Checker

---

## Problem Statement

Given a string `s` composed of different combinations of `'(' , ')' , '{' , '}' , '[' , ']'`, **determine whether the parentheses/brackets are balanced and properly nested**.

A string is considered **valid** if:
1. **Open brackets** are closed by the **same type** of brackets.
2. **Open brackets** are closed in the **correct order**.

---

## Examples

### Example 1
**Input:**  
`s = "[{()}]"`  
**Output:**  
`true`  
**Explanation:**  
All brackets are properly opened and closed in correct order.

---

### Example 2
**Input:**  
`s = "[()()]{}"`  
**Output:**  
`true`  
**Explanation:**  
Nested and separate brackets are balanced.

---

### Example 3
**Input:**  
`s = "([]"`  
**Output:**  
`false`  
**Explanation:**  
There is a missing `)` at the end.

---

### Example 4
**Input:**  
`s = "([{]})"`  
**Output:**  
`false`  
**Explanation:**  
The order of closing brackets is incorrect.

---

## Constraints

- `1 ≤ s.size() ≤ 10^6`
- `s[i] ∈ {'{', '}', '(', ')', '[', ']'}`

---

## Approach

- Use a **stack** to track open brackets.
- For each character in the string:
  - If it’s an **opening bracket**, push it to the stack.
  - If it’s a **closing bracket**, check the top of the stack:
    - If the stack is empty or top doesn’t match the type, return `false`.
    - Otherwise, pop from the stack.
- At the end, the stack should be empty for the string to be valid.

---

## Java Implementation

```java
import java.util.Stack;

public class ParenthesisChecker {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}