# H-Index Calculation

## Problem Statement

Given an integer array `citations[]`, where `citations[i]` is the number of citations a researcher received for the *i-th* paper, determine the **H-Index**.

The **H-Index** is defined as the largest number **H** such that the researcher has at least **H** papers with **at least H citations** each.

---

## Examples

### Example 1
- **Input:**  
  `citations[] = [3, 0, 5, 3, 0]`
- **Output:**  
  `3`
- **Explanation:**  
  The researcher has 3 papers with at least 3 citations: [3, 5, 3].

---

### Example 2
- **Input:**  
  `citations[] = [5, 1, 2, 4, 1]`
- **Output:**  
  `2`
- **Explanation:**  
  Three papers have ≥2 citations: [5, 2, 4].  
  H-index cannot be 3 because only two papers have ≥3 citations.

---

### Example 3
- **Input:**  
  `citations[] = [0, 0]`
- **Output:**  
  `0`
- **Explanation:**  
  No paper has any citations, so H-index is 0.

---

## Constraints

- `1 <= citations.length <= 10^6`  
- `0 <= citations[i] <= 10^6`

---

## Approach

1. **Sort** the array in descending order.
2. Traverse and find the largest index `i` such that `citations[i] >= i + 1`.

