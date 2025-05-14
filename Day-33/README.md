# Aggressive Cows Problem

## Problem Statement

You are given an array `stalls[]` of **unique integers**, where each element represents the **position of a stall** on a number line. You are also given an integer `k`, representing the number of **aggressive cows**.

Your task is to place these cows in the stalls such that the **minimum distance** between any two of them is **maximized**.

---

## Examples

### Example 1

- **Input:**  
  `stalls = [1, 2, 4, 8, 9]`  
  `k = 3`  
- **Output:**  
  `3`  
- **Explanation:**  
  Place cows at stall positions `1`, `4`, and `8`.  
  Minimum distance between any two cows = `3`.

---

### Example 2

- **Input:**  
  `stalls = [10, 1, 2, 7, 5]`  
  `k = 3`  
- **Output:**  
  `4`  
- **Explanation:**  
  Sorted stalls = `[1, 2, 5, 7, 10]`.  
  Place cows at `1`, `5`, and `10`.  
  Minimum distance = `4`.

---

### Example 3

- **Input:**  
  `stalls = [2, 12, 11, 3, 26, 7]`  
  `k = 5`  
- **Output:**  
  `1`  
- **Explanation:**  
  Number of stalls = Number of cows.  
  Any configuration results in minimum distance of at least `1`.

---

## Constraints

- `2 ≤ stalls.length ≤ 10⁶`
- `0 ≤ stalls[i] ≤ 10⁸`
- `2 ≤ k ≤ stalls.length`

---

## Optimal Approach – Binary Search on Answer

### Core Idea

This is a **binary search on the answer** problem.  
We are trying to **maximize** the minimum distance between any two cows.

### Steps

1. **Sort the stalls array.**
2. **Binary search** for the maximum minimum distance (`low = 1`, `high = max - min`).
3. For each `mid`, check if it’s **possible** to place all cows such that the distance between any two is at least `mid`.
   - Place first cow at the first stall.
   - For every other stall, place a cow only if the distance from the last placed cow is at least `mid`.

### Function to check feasibility

```java
private boolean canPlaceCows(int[] stalls, int k, int minDist) {
    int count = 1, lastPos = stalls[0];
    for (int i = 1; i < stalls.length; i++) {
        if (stalls[i] - lastPos >= minDist) {
            count++;
            lastPos = stalls[i];
        }
        if (count >= k) return true;
    }
    return false;
}