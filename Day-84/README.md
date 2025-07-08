# Word Search in Matrix

---

## Problem Statement

Given a 2D grid of characters `mat[][]` of size `n × m` and a target string `word`, determine if the word exists in the matrix.  
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The **same cell cannot be used more than once**.

---

## Examples

### Example 1

**Input:**  
`mat = [['T', 'E', 'E'], ['S', 'G', 'K'], ['T', 'E', 'L']]`  
`word = "GEEK"`  
**Output:**  
`true`  
**Explanation:**  
You can trace "GEEK" through:  
`mat[1][1] = 'G'` → `mat[1][2] = 'E'` → `mat[0][2] = 'E'` → `mat[0][1] = 'K'`

---

### Example 2

**Input:**  
`mat = [['T', 'E', 'U'], ['S', 'G', 'K'], ['T', 'E', 'L']]`  
`word = "GEEK"`  
**Output:**  
`false`  
**Explanation:**  
There is no possible path to form the word "GEEK" using adjacent cells without reusing any cell.

---

### Example 3

**Input:**  
`mat = [['A', 'B', 'A'], ['B', 'A', 'B']]`  
`word = "AB"`  
**Output:**  
`true`  
**Explanation:**  
Multiple paths like `mat[0][0] → mat[0][1]` or `mat[0][1] → mat[1][1]` form the word.

---

## Constraints

- `1 ≤ n, m ≤ 6`
- `1 ≤ L ≤ 15` (where L is the length of the word)
- `mat[i][j]`, `word[i]` ∈ lowercase or uppercase English letters

---

## Approach

Use **Backtracking with DFS**:

### Steps:
1. Iterate through each cell in the matrix.
2. If a cell matches the first character of the word, initiate a DFS.
3. During DFS:
   - Check bounds and if the character matches.
   - Mark the cell as visited.
   - Recurse in 4 directions (up, down, left, right).
   - Backtrack (unmark the cell).
4. If any path matches the word, return `true`.

---

## Java Implementation

```java
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int idx) {
        if (idx == word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
            board[i][j] != word.charAt(idx))
            return false;

        char temp = board[i][j];
        board[i][j] = '#';  // mark as visited

        boolean found = dfs(board, word, i + 1, j, idx + 1) ||
                        dfs(board, word, i - 1, j, idx + 1) ||
                        dfs(board, word, i, j + 1, idx + 1) ||
                        dfs(board, word, i, j - 1, idx + 1);

        board[i][j] = temp; // backtrack
        return found;
    }

    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
        char[][] mat = {
            {'T', 'E', 'E'},
            {'S', 'G', 'K'},
            {'T', 'E', 'L'}
        };
        System.out.println(ws.exist(mat, "GEEK")); // true
    }
}