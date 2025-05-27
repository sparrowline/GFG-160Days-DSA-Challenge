# Count the Number of Elements in the Union of Two Arrays

## Problem Statement

Given two arrays `a[]` and `b[]`, your task is to **find the number of distinct elements** in the union of both arrays.

> Union of arrays refers to a set of all unique elements from both arrays, **ignoring any duplicates**.

---

## Examples

### Example 1
- **Input:**  
  `a = [1, 2, 3, 4, 5]`, `b = [1, 2, 3]`  
- **Output:** `5`  
- **Explanation:** Union set = {1, 2, 3, 4, 5}

---

### Example 2
- **Input:**  
  `a = [85, 25, 1, 32, 54, 6]`, `b = [85, 2]`  
- **Output:** `7`  
- **Explanation:** Union set = {85, 25, 1, 32, 54, 6, 2}

---

### Example 3
- **Input:**  
  `a = [1, 2, 1, 1, 2]`, `b = [2, 2, 1, 2, 1]`  
- **Output:** `2`  
- **Explanation:** Union set = {1, 2}

---

## Constraints

- `1 ≤ a.length, b.length ≤ 10^6`
- `0 ≤ a[i], b[i] ≤ 10^5`

---

## Approach – Using HashSet (Optimal)

### Method

1. Create a `HashSet<Integer>`.
2. Add all elements from array `a[]`.
3. Add all elements from array `b[]`.
4. Return the size of the set, which represents the **count of distinct elements**.

---

## Java Implementation

```java
import java.util.*;

public class UnionOfArrays {

    public int countUnion(int[] a, int[] b) {
        Set<Integer> unionSet = new HashSet<>();

        for (int num : a) {
            unionSet.add(num);
        }

        for (int num : b) {
            unionSet.add(num);
        }

        return unionSet.size();
    }
}