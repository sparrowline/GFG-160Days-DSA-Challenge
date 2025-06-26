# N-Queen Problem

---

## Problem Statement

The **N-Queens puzzle** is the problem of placing `n` queens on an `n x n` chessboard such that **no two queens attack each other**. A queen can attack another queen if it is placed on the same **row**, **column**, or **diagonal**.

Given an integer `n`, find **all distinct solutions** to the N-Queens puzzle.

### Output Format
- Return the solutions as a list of permutations.
- Each permutation represents a distinct configuration where:
  - The `i-th` element indicates the **row position** of the queen in the `i-th` column.
- Return the solutions in any order.

---

## Examples

### Example 1

**Input:**  
`n = 1`  
**Output:**  
`[1]`  
**Explanation:**  
Only one queen can be placed in the single cell available.

---

### Example 2

**Input:**  
`n = 4`  
**Output:**  
`[[2, 4, 1, 3], [3, 1, 4, 2]]`  
**Explanation:**  
There are two valid configurations for a 4x4 board.  
In the representation:
- `[2, 4, 1, 3]` means:
  - Column 1 → Row 2  
  - Column 2 → Row 4  
  - Column 3 → Row 1  
  - Column 4 → Row 3

---

### Example 3

**Input:**  
`n = 2`  
**Output:**  
`[]`  
**Explanation:**  
No valid arrangement exists where 2 queens don't attack each other.

---

## Constraints

- `1 ≤ n ≤ 10`

---

## Java Implementation

```java
import java.util.*;

public class NQueenSolver {
    public List<List<Integer>> solveNQueens(int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, new ArrayList<>(), new boolean[n], new boolean[2 * n], new boolean[2 * n], result, n);
        return result;
    }

    private void backtrack(int col, List<Integer> current, boolean[] rows, boolean[] d1, boolean[] d2,
                           List<List<Integer>> result, int n) {
        if (col == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int row = 0; row < n; row++) {
            int id1 = row - col + n;
            int id2 = row + col;

            if (rows[row] || d1[id1] || d2[id2]) continue;

            current.add(row + 1);
            rows[row] = d1[id1] = d2[id2] = true;

            backtrack(col + 1, current, rows, d1, d2, result, n);

            current.remove(current.size() - 1);
            rows[row] = d1[id1] = d2[id2] = false;
        }
    }
}