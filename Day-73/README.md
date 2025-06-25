# Implement Power Function (b^e)

---

## Problem Statement

Implement the function `power(b, e)` that calculates `b` raised to the power of `e` (i.e. \( b^e \)).

You must handle **positive**, **negative**, and **zero** values for the exponent `e`. The base `b` may be **negative**, **fractional**, or **positive**, but **never exactly 0 when `e <= 0`**.

---

## Examples

### Example 1

**Input:**  
`b = 3.00000`, `e = 5`  
**Output:**  
`243.00000`  
**Explanation:**  
3 raised to the power 5 is 3 × 3 × 3 × 3 × 3 = 243

---

### Example 2

**Input:**  
`b = 0.55000`, `e = 3`  
**Output:**  
`0.16638`  
**Explanation:**  
0.55³ = 0.166375 which rounds to 0.16638

---

### Example 3

**Input:**  
`b = -0.67000`, `e = -7`  
**Output:**  
`-16.49971`  
**Explanation:**  
(-0.67)^(-7) = 1 / ((-0.67)^7) = -16.49971

---

## Constraints

- `-100.0 < b < 100.0`
- `-10^9 <= e <= 10^9`
- Either `b != 0` or `e > 0`
- `-10^4 <= b^e <= 10^4`

---

## Java Implementation

```java
public class Solution {
    public double power(double b, int e) {
        long exponent = e;
        if (exponent < 0) {
            b = 1 / b;
            exponent = -exponent;
        }

        double result = 1.0;
        while (exponent > 0) {
            if ((exponent % 2) == 1) {
                result *= b;
            }
            b *= b;
            exponent /= 2;
        }

        return result;
    }
}