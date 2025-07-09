# Find Only Repetitive Element from 1 to n-1

---

## Problem Statement

Given an array `arr[]` of size `n`, where the elements are in the range `1` to `n-1`, and **only one element is repeated exactly once**, your task is to identify the **repeating element**.

> ✅ It is guaranteed that there is **one** and **only one** repeating element.

---

## Examples

### Example 1

**Input:**  
`arr = [1, 3, 2, 3, 4]`  
**Output:**  
`3`  
**Explanation:**  
Number `3` appears twice, and all other elements appear once.

---

### Example 2

**Input:**  
`arr = [1, 5, 1, 2, 3, 4]`  
**Output:**  
`1`  
**Explanation:**  
Number `1` is repeated, all other numbers are unique.

---

### Example 3

**Input:**  
`arr = [1, 1]`  
**Output:**  
`1`  
**Explanation:**  
Array has size `2`, and both elements are `1`.

---

## Constraints

- `2 ≤ arr.length ≤ 10⁵`
- `1 ≤ arr[i] ≤ n - 1` (where `n` is the length of the array)

---

## Approach

There are multiple approaches to solve this problem. We'll discuss three common and efficient techniques:

### ✅ Approach 1: Using Frequency Array

- Use an auxiliary array of size `n` to keep track of frequency.
- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

### ✅ Approach 2: Using HashSet

- Traverse and store elements in a set. If an element is already in the set, it's the repeated one.
- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

### ✅ Approach 3: Using Math Formula

- Since we know the array contains numbers from `1` to `n-1`, sum of numbers without duplicate = `n*(n-1)/2`.
- Calculate actual sum of array. Subtract expected sum to get the duplicate.
- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

---

## Java Implementation (Approach 2: HashSet)

```java
import java.util.*;

public class FindDuplicate {
    public static int findDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) return num;
            seen.add(num);
        }
        return -1; // This won't happen as per problem guarantee
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 3, 4};
        int[] arr2 = {1, 5, 1, 2, 3, 4};
        int[] arr3 = {1, 1};

        System.out.println(findDuplicate(arr1)); // Output: 3
        System.out.println(findDuplicate(arr2)); // Output: 1
        System.out.println(findDuplicate(arr3)); // Output: 1
    }
}