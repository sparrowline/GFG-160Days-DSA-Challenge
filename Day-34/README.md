# Book Allocation Problem

## Problem Statement

You are given an array `arr[]` where each element `arr[i]` represents the number of pages in the `i-th` book.  
You are also given an integer `k`, which denotes the number of students.

Your task is to allocate books to students such that:

1. Each student receives **at least one book**.
2. Each student gets a **contiguous block of books**.
3. No book is allocated to more than one student.

> The **goal** is to **minimize the maximum number of pages** allocated to any student across all possible valid allocations.

> If a valid assignment is **not possible**, return `-1`.

---

## Examples

### Example 1

- **Input:**  
  `arr = [12, 34, 67, 90]`  
  `k = 2`  
- **Output:** `113`  
- **Explanation:**  
  Possible allocations and max pages:
  - `[12]` and `[34, 67, 90]` → max = 191
  - `[12, 34]` and `[67, 90]` → max = 157
  - `[12, 34, 67]` and `[90]` → max = 113 ← Minimum

---

### Example 2

- **Input:**  
  `arr = [15, 17, 20]`  
  `k = 5`  
- **Output:** `-1`  
- **Explanation:**  
  Fewer books than students → invalid allocation.

---

### Example 3

- **Input:**  
  `arr = [22, 23, 67]`, `k = 1`  
- **Output:** `112`  
- **Explanation:**  
  All books to one student → sum = `112`.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁶`
- `1 ≤ arr[i] ≤ 10³`
- `1 ≤ k ≤ 10³`

---

## Optimal Approach – Binary Search on Answer

### Core Idea

- This is a classic **Binary Search on the answer** problem.
- We want to find the **minimum possible value of the maximum pages** a student can be assigned.

---

### Strategy

1. The minimum number of pages a student can get is `max(arr)`.
2. The maximum is `sum(arr)`.
3. Apply binary search on this range.
4. For each `mid` value, **check if it’s possible** to allocate books such that:
   - No student gets more than `mid` pages.
   - Allocation is contiguous.
   - Total students used ≤ `k`.

---

### Feasibility Function

```java
private boolean isPossible(int[] arr, int k, int maxPages) {
    int students = 1, currentSum = 0;

    for (int pages : arr) {
        if (pages > maxPages) return false;

        if (currentSum + pages > maxPages) {
            students++;
            currentSum = pages;
        } else {
            currentSum += pages;
        }
    }

    return students <= k;
}# Book Allocation Problem

## Problem Statement

You are given an array `arr[]` where each element `arr[i]` represents the number of pages in the `i-th` book.  
You are also given an integer `k`, which denotes the number of students.

Your task is to allocate books to students such that:

1. Each student receives **at least one book**.
2. Each student gets a **contiguous block of books**.
3. No book is allocated to more than one student.

> The **goal** is to **minimize the maximum number of pages** allocated to any student across all possible valid allocations.

> If a valid assignment is **not possible**, return `-1`.

---

## Examples

### Example 1

- **Input:**  
  `arr = [12, 34, 67, 90]`  
  `k = 2`  
- **Output:** `113`  
- **Explanation:**  
  Possible allocations and max pages:
  - `[12]` and `[34, 67, 90]` → max = 191
  - `[12, 34]` and `[67, 90]` → max = 157
  - `[12, 34, 67]` and `[90]` → max = 113 ← Minimum

---

### Example 2

- **Input:**  
  `arr = [15, 17, 20]`  
  `k = 5`  
- **Output:** `-1`  
- **Explanation:**  
  Fewer books than students → invalid allocation.

---

### Example 3

- **Input:**  
  `arr = [22, 23, 67]`, `k = 1`  
- **Output:** `112`  
- **Explanation:**  
  All books to one student → sum = `112`.

---

## Constraints

- `1 ≤ arr.length ≤ 10⁶`
- `1 ≤ arr[i] ≤ 10³`
- `1 ≤ k ≤ 10³`

---

## Optimal Approach – Binary Search on Answer

### Core Idea

- This is a classic **Binary Search on the answer** problem.
- We want to find the **minimum possible value of the maximum pages** a student can be assigned.

---

### Strategy

1. The minimum number of pages a student can get is `max(arr)`.
2. The maximum is `sum(arr)`.
3. Apply binary search on this range.
4. For each `mid` value, **check if it’s possible** to allocate books such that:
   - No student gets more than `mid` pages.
   - Allocation is contiguous.
   - Total students used ≤ `k`.

---

### Feasibility Function

```java
private boolean isPossible(int[] arr, int k, int maxPages) {
    int students = 1, currentSum = 0;

    for (int pages : arr) {
        if (pages > maxPages) return false;

        if (currentSum + pages > maxPages) {
            students++;
            currentSum = pages;
        } else {
            currentSum += pages;
        }
    }

    return students <= k;
}