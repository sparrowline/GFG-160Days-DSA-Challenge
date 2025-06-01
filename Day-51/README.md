# Count Pairs with Sum Strictly Less than Target

## Problem Statement

Given an array of integers `arr[]` and an integer `target`, count the number of **pairs** `(i, j)` such that:

- `i < j`
- `arr[i] + arr[j] < target`

---

## Examples

### Example 1
- **Input:**  
  `arr = [7, 2, 5, 3], target = 8`
- **Output:**  
  `2`
- **Explanation:**  
  Valid pairs:  
  - `(2, 5)`  
  - `(2, 3)`

---

### Example 2
- **Input:**  
  `arr = [5, 2, 3, 2, 4, 1], target = 5`
- **Output:**  
  `4`
- **Explanation:**  
  Valid pairs:  
  - `(2, 2)`  
  - `(2, 1)`  
  - `(3, 1)`  
  - `(2, 1)`

---

### Example 3
- **Input:**  
  `arr = [2, 1, 8, 3, 4, 7, 6, 5], target = 7`
- **Output:**  
  `6`
- **Explanation:**  
  Valid pairs:  
  - `(2, 1)`  
  - `(2, 3)`  
  - `(2, 4)`  
  - `(1, 3)`  
  - `(1, 4)`  
  - `(1, 5)`

---

## Constraints

- `1 ≤ arr.length ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^4`
- `1 ≤ target ≤ 10^4`

---

## Approach – Two Pointers After Sorting

### Method

1. **Sort the array** in ascending order.
2. Initialize two pointers:  
   - `left = 0`  
   - `right = n - 1`
3. For each element at `left`, move `right` towards `left` to find how many elements satisfy `arr[left] + arr[right] < target`.
4. Use a nested loop or binary search for optimization.
5. The optimal solution uses **two pointers** to count efficiently.

---

## Optimized Java Implementation (O(n log n))

```java
import java.util.Arrays;

public class CountPairsWithSumLessThanTarget {
    public int countPairs(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1, count = 0;

        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}