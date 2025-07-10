# Missing in Array

---

## Problem Statement

You are given an array `arr[]` of size `n - 1` containing **distinct integers** in the range from `1` to `n`. Your task is to **find and return the one missing number** from the sequence.

> ✅ It is guaranteed that only **one** number is missing and all other numbers from `1` to `n` are present.

---

## Examples

### Example 1

**Input:**  
`arr = [1, 2, 3, 5]`  
**Output:**  
`4`  
**Explanation:**  
The complete range is `[1, 2, 3, 4, 5]`. The number `4` is missing.

---

### Example 2

**Input:**  
`arr = [8, 2, 4, 5, 3, 7, 1]`  
**Output:**  
`6`  
**Explanation:**  
From 1 to 8, only `6` is not present.

---

### Example 3

**Input:**  
`arr = [1]`  
**Output:**  
`2`  
**Explanation:**  
Only one number (`1`) is present. The missing number is `2`.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁶`
- `1 ≤ arr[i] ≤ arr.length + 1`
- All elements in `arr[]` are distinct.

---

## Approach

There are multiple efficient strategies to solve this:

### ✅ Approach 1: Using Mathematical Formula

- The sum of first `n` natural numbers = `n * (n + 1) / 2`
- Subtract the sum of array from this total to get the missing number.

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## Java Implementation (Using Sum Formula)

```java
public class MissingNumber {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {8, 2, 4, 5, 3, 7, 1};
        int[] arr3 = {1};

        System.out.println(findMissing(arr1)); // Output: 4
        System.out.println(findMissing(arr2)); // Output: 6
        System.out.println(findMissing(arr3)); // Output: 2
    }
}