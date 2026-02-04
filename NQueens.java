    import java.util.*;

public class NQueens {



    private List<List<String>> ans = new ArrayList<>();
    private boolean[] cols;
    private boolean[] diag1;
    private boolean[] diag2;
    private char[][] board;

    public List<List<String>> solveNQueens(int n) {
        cols = new boolean[n];
        diag1 = new boolean[2 * n - 1];
        diag2 = new boolean[2 * n - 1];
        board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        placeQueens(0, n);
        return ans;
    }

    private void placeQueens(int row, int n) {

        if (row == n) {
            ans.add(buildBoard(n));
            return;
        }

        for (int col = 0; col < n; col++) {

            int d1 = row - col + n - 1;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }

            // place queen
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            placeQueens(row + 1, n);

            // backtrack
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    private List<String> buildBoard(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        NQueens nq = new NQueens();
        int n = 4;
        List<List<String>> solutions = nq.solveNQueens(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
}
}


