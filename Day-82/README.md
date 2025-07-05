# Next Greater Element

---

## Problem Statement

Given an array `arr[]` of integers, your task is to **find the next greater element** (NGE) for each element in the array in the order of their appearance.  
The **Next Greater Element** of an element `x` is the **nearest element on the right side** which is **greater** than `x`. If no such element exists, return `-1` for that position.

---

## Examples

### Example 1
**Input:**  
`arr[] = [1, 3, 2, 4]`  
**Output:**  
`[3, 4, 4, -1]`  
**Explanation:**  
- NGE of 1 is 3  
- NGE of 3 is 4  
- NGE of 2 is 4  
- NGE of 4 is -1  

---

### Example 2
**Input:**  
`arr[] = [6, 8, 0, 1, 3]`  
**Output:**  
`[8, -1, 1, 3, -1]`  
**Explanation:**  
- NGE of 6 is 8  
- NGE of 8 is -1  
- NGE of 0 is 1  
- NGE of 1 is 3  
- NGE of 3 is -1  

---

### Example 3
**Input:**  
`arr[] = [10, 20, 30, 50]`  
**Output:**  
`[20, 30, 50, -1]`  

---

### Example 4
**Input:**  
`arr[] = [50, 40, 30, 10]`  
**Output:**  
`[-1, -1, -1, -1]`  

---

## Constraints

- `1 ≤ arr.size() ≤ 10^6`
- `0 ≤ arr[i] ≤ 10^9`

---

## Approach

We use a **monotonic stack** (stores indices) to keep track of elements for which the next greater element hasn’t been found yet.

### Steps:
1. Initialize an empty stack and a result array of same size as input with all values as `-1`.
2. Traverse the array from **right to left**:
   - While stack is not empty and top of stack ≤ current element, pop the stack.
   - If stack is not empty, the top of the stack is the next greater element.
   - Push the current element on stack.
3. Return the result array.

---

## Java Implementation

```java
import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
}