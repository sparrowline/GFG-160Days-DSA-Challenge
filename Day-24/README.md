# Insert and Merge Intervals

## Problem Statement

Geek has an array of **non-overlapping intervals** `intervals` where `intervals[i] = [startᵢ, endᵢ]` represent the start and the end of the *iᵗʰ* event. The intervals are **sorted in ascending order** by `startᵢ`.

Your task is to insert a new interval `newInterval = [newStart, newEnd]` such that:

- The list remains sorted by `startᵢ`.
- The list contains **no overlapping intervals** (merge if necessary).

---

## Examples

### Example 1
- **Input:**  
  `intervals = [[1,3], [4,5], [6,7], [8,10]]`  
  `newInterval = [5,6]`
- **Output:**  
  `[[1,3], [4,7], [8,10]]`
- **Explanation:**  
  The new interval `[5,6]` overlaps with `[4,5]` and `[6,7]`, so they are merged.

---

### Example 2
- **Input:**  
  `intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]]`  
  `newInterval = [4,9]`
- **Output:**  
  `[[1,2], [3,10], [12,16]]`
- **Explanation:**  
  The new interval `[4,9]` overlaps with `[3,5], [6,7], [8,10]`.

---

## Constraints

- `1 ≤ intervals.length ≤ 10⁵`
- `0 ≤ startᵢ, endᵢ ≤ 10⁹`

---

## Optimal Approach

We traverse the intervals in three stages:

1. **Add all intervals ending before `newInterval` starts.**
2. **Merge overlapping intervals** with `newInterval`.
3. **Add all intervals starting after `newInterval` ends.**

Time Complexity: **O(n)**  
Space Complexity: **O(n)** (for output list)

---
