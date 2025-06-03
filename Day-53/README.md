# Count Pairs with Given Sum in Sorted Array

## Problem Statement

You are given:
- A **sorted array** `arr[]` of integers
- A **target sum**

Your task is to **count the number of pairs** `(i, j)` such that:

- `arr[i] + arr[j] == target`
- `i < j` (i.e., elements must be from **distinct indices**)

---

## Examples

### Example 1

- **Input:**  
  `arr = [-1, 1, 5, 5, 7], target = 6`
- **Output:**  
  `3`
- **Explanation:**  
  Valid pairs: `(1,5)`, `(1,5)`, `(-1,7)`.

---

### Example 2

- **Input:**  
  `arr = [1, 1, 1, 1], target = 2`
- **Output:**  
  `6`
- **Explanation:**  
  6 unique index-based pairs summing to 2:
  - `(0,1)`, `(0,2)`, `(0,3)`, `(1,2)`, `(1,3)`, `(2,3)`

---

### Example 3

- **Input:**  
  `arr = [-1, 10, 10, 12, 15], target = 125`
- **Output:**  
  `0`
- **Explanation:**  
  No such pair exists.

---

## Constraints

- `-10^5 <= target <= 10^5`
- `2 <= arr.length <= 10^5`
- `-10^5 <= arr[i] <= 10^5`
- The array is **sorted**

---

## Approach – Two Pointers

### Method

1. Initialize two pointers: `left = 0`, `right = n - 1`
2. While `left < right`:
   - If `arr[left] + arr[right] == target`, count duplicates on both sides to compute the number of combinations.
   - If sum < target → move `left` forward.
   - If sum > target → move `right` backward.

---

## Optimized Java Implementation (O(n))

```java
public class CountPairsWithSum {
    public int countPairs(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                if (arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                } else {
                    int lCount = 1, rCount = 1;

                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        lCount++;
                        left++;
                    }

                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        rCount++;
                        right--;
                    }

                    count += lCount * rCount;
                    left++;
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}