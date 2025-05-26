# Intersection of Two Arrays

## Problem Statement

Given two integer arrays `a[]` and `b[]`, **find their intersection**, meaning the **common elements between the two arrays**, without **any duplicates**.

> The order of elements in the output does **not** matter, as the driver code will **sort** them before printing.

---

## Examples

### Example 1
- **Input:**  
  `a = [1, 2, 1, 3, 1]`, `b = [3, 1, 3, 4, 1]`
- **Output:** `[1, 3]`
- **Explanation:** 1 and 3 are common in both arrays. Only unique occurrences are returned.

---

### Example 2
- **Input:**  
  `a = [1, 1, 1]`, `b = [1, 1, 1, 1, 1]`
- **Output:** `[1]`
- **Explanation:** 1 is the only common element. Only one instance is kept in the result.

---

### Example 3
- **Input:**  
  `a = [1, 2, 3]`, `b = [4, 5, 6]`
- **Output:** `[]`
- **Explanation:** No common elements exist.

---

## Constraints

- `1 ≤ a.length, b.length ≤ 10^5`
- `1 ≤ a[i], b[i] ≤ 10^5`

---

## Approach – Using HashSet (Optimal – O(n + m) Time)

### Method

1. Create a `HashSet<Integer>` for the first array.
2. Create a `Result Set` to store the final intersection.
3. Iterate through the second array:
   - If an element exists in the first set and is not already in the result, add it.
4. Convert result set to list or array and return.

---

## Java Implementation

```java
import java.util.*;

public class IntersectionOfArrays {

    public int[] findIntersection(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : a) {
            setA.add(num);
        }

        for (int num : b) {
            if (setA.contains(num)) {
                resultSet.add(num); // only unique common elements
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}