# Stock Span Problem

---

## Problem Statement

The Stock Span Problem is a classic financial algorithmic challenge where we are given an array of daily stock prices `arr[]`, and we must compute the **stock span** for each day.  

The **stock span** on a given day `i` is defined as the maximum number of consecutive days (up to and including the current day) the price of the stock has been **less than or equal** to its price on the current day.

---

## Examples

### Example 1
**Input:**  
`arr[] = [100, 80, 60, 70, 60, 75, 85]`  
**Output:**  
`[1, 1, 1, 2, 1, 4, 6]`  
**Explanation:**  
- Day 1: 100 → 1  
- Day 2: 80 → 1  
- Day 3: 60 → 1  
- Day 4: 70 (>= 60) → span = 2  
- Day 5: 60 → 1  
- Day 6: 75 (>= 60, 70, 60) → span = 4  
- Day 7: 85 (>= 75, 60, 70, 60, 80) → span = 6

---

### Example 2
**Input:**  
`arr[] = [10, 4, 5, 90, 120, 80]`  
**Output:**  
`[1, 1, 2, 4, 5, 1]`  
**Explanation:**  
- Day 1: 10 → 1  
- Day 2: 4 → 1  
- Day 3: 5 (>= 4) → span = 2  
- Day 4: 90 (>= 5, 4, 10) → span = 4  
- Day 5: 120 (>= 90, 5, 4, 10) → span = 5  
- Day 6: 80 → 1  

---

## Constraints

- `1 ≤ arr.size() ≤ 10^5`  
- `1 ≤ arr[i] ≤ 10^5`  

---

## Approach

We use a **stack-based approach** to solve the problem in **O(n)** time. The stack stores **indices** of the elements.  

### Steps:
1. Initialize a stack and a result array of same size.
2. Traverse the array from left to right.
3. While the stack is not empty and the price at the top of the stack is less than or equal to current price, pop it.
4. If the stack is empty, that means the price was highest so far → span is current index + 1.
5. Else, span is the difference between current index and index at top of stack.
6. Push the current index onto the stack.

---

## Java Implementation

```java
import java.util.*;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(calculateSpan(prices)));
    }
}