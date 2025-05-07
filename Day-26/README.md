# Minimum Removals to Make Intervals Non-Overlapping

## Problem Statement

You are given a 2D array `intervals[][]` where each interval is represented as `intervals[i] = [startᵢ, endᵢ]`.

Your task is to return the **minimum number of intervals** that must be **removed** so that the remaining intervals are **non-overlapping**.

---

## Examples

### Example 1

- **Input:**  
  `intervals = [[1, 2], [2, 3], [3, 4], [1, 3]]`
- **Output:**  
  `1`
- **Explanation:**  
  Removing `[1, 3]` leaves `[1, 2], [2, 3], [3, 4]`, which are all non-overlapping.

---

### Example 2

- **Input:**  
  `intervals = [[1, 3], [1, 3], [1, 3]]`
- **Output:**  
  `2`
- **Explanation:**  
  At most one `[1, 3]` can remain. The other two must be removed.

---

### Example 3

- **Input:**  
  `intervals = [[1, 2], [5, 10], [18, 35], [40, 45]]`
- **Output:**  
  `0`
- **Explanation:**  
  All intervals are already non-overlapping. No removal needed.

---

## Constraints

- `1 ≤ intervals.length ≤ 10⁵`
- `|interval[i]| == 2`
- `0 ≤ startᵢ < endᵢ ≤ 5 * 10⁴`

---

## Expected Time Complexity

- **Time Complexity:** O(n log n)
- **Space Complexity:** O(1) (excluding output)

---

## Optimal Approach

This is a classic **Greedy + Sorting** problem:

1. **Sort** the intervals by their **end time** in ascending order.
2. Iterate through the intervals while maintaining the **end of the last non-overlapping interval**.
3. If the current interval's start is less than the previous end, it overlaps → count it for removal.
4. Else, update the end boundary.

---