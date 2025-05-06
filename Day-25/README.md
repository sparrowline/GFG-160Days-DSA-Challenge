# Merge Overlapping Intervals

## Problem Statement

You are given an array of intervals `arr[][]`, where each interval is represented as `arr[i] = [startᵢ, endᵢ]`.

Your task is to **merge all overlapping intervals** and return an array of the non-overlapping intervals that cover all the intervals in the input.

---

## Examples

### Example 1

- **Input:**  
  `arr = [[1,3],[2,4],[6,8],[9,10]]`
- **Output:**  
  `[[1,4], [6,8], [9,10]]`
- **Explanation:**  
  `[1,3]` and `[2,4]` overlap, so they are merged to `[1,4]`. Other intervals are non-overlapping.

---

### Example 2

- **Input:**  
  `arr = [[6,8],[1,9],[2,4],[4,7]]`
- **Output:**  
  `[[1,9]]`
- **Explanation:**  
  All intervals overlap with `[1,9]`, so they are merged into a single interval.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁵`
- `0 ≤ startᵢ ≤ endᵢ ≤ 10⁵`

---

## Optimal Approach

1. **Sort the intervals** based on the start value.
2. Initialize a list to hold merged intervals.
3. Iterate through the sorted list:
   - If the current interval overlaps with the last merged one, **merge them**.
   - Else, add the current interval as is.

**Time Complexity:** O(n log n) due to sorting  
**Space Complexity:** O(n) for the result list

---