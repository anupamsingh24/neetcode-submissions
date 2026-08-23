class Solution {
    int ROWS, COLS;
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];

        for(int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (dfs(board, word, i, j, 0)) return true
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int row, int col, int i) {
        if (i == word.length()) return true;

        if (row < 0 || col < 0 || row >= ROWS || col >= COLS || visited[row][col] || board[row][col] != word.charAt(i)) {
            return false;
        }

        visited[row][col] = true;
        boolean res = dfs(board, word, row + 1, col, i+1) ||
                        dfs(board, word, row -1 ,col, i+1) ||
                        dfs(board, word, row, col + 1, i+1) ||
                        dfs(board, word, row, col - 1, i+1);
        visited[row][col] = false;
        return res;
    }
}
