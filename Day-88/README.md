# Unique Number I

---

## Problem Statement

You are given an **unsorted array** `arr[]` of **positive integers** where every number occurs **exactly twice**, except for **one number**, which occurs **only once**.  
Your task is to **find and return** that unique number.

---

## Examples

### Example 1

**Input:**  
`arr = [1, 2, 1, 5, 5]`  
**Output:**  
`2`  
**Explanation:**  
All elements appear twice except `2`.

---

### Example 2

**Input:**  
`arr = [2, 30, 2, 15, 20, 30, 15]`  
**Output:**  
`20`  
**Explanation:**  
`20` appears only once. Every other number appears twice.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁶`
- `0 ≤ arr[i] ≤ 10⁹`

---

## Approach

### ✅ Efficient Approach: XOR Operation

- The XOR of a number with itself is `0`.  
- The XOR of a number with `0` is the number itself.
- If you XOR all the elements, the elements occurring twice will cancel each other out, leaving the unique number.

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## Java Implementation

```java
public class UniqueNumberFinder {
    public static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 5, 5};
        int[] arr2 = {2, 30, 2, 15, 20, 30, 15};

        System.out.println(findUnique(arr1)); // Output: 2
        System.out.println(findUnique(arr2)); // Output: 20
    }
}