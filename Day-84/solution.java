class isWordExist {
    static int n, m;
    static int[] dx = {-1, 1, 0, 0}; // up, down
    static int[] dy = {0, 0, -1, 1}; // left, right

    public static boolean isWordExist(char[][] mat, String word) {
        n = mat.length;
        m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    if (dfs(mat, word, 0, i, j)) return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] mat, String word, int idx, int x, int y) {
        if (idx == word.length()) return true;
        if (x < 0 || y < 0 || x >= n || y >= m || mat[x][y] != word.charAt(idx)) return false;

        char temp = mat[x][y];
        mat[x][y] = '#'; // mark as visited

        for (int dir = 0; dir < 4; dir++) {
            int newX = x + dx[dir];
            int newY = y + dy[dir];

            if (dfs(mat, word, idx + 1, newX, newY)) {
                mat[x][y] = temp; // unmark before returning
                return true;
            }
        }

        mat[x][y] = temp; // backtrack
        return false;
    }
}