
public class NKnights {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        findPossibilities(board, 0, 0, n);

    }

    static void findPossibilities(boolean[][] board, int row, int col, int target) {
        if (target == 0) {
            display(board);
            System.out.println("");
            return;
        }

        if (col == board.length) {
            findPossibilities(board, row + 1, 0, target);
            return;
        }
        if (row == board.length - 1) {
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            findPossibilities(board, row, col + 1, target - 1);
            board[row][col] = false;
        }
        findPossibilities(board, row, col + 1, target);

    }

    static void display(boolean[][] board) {
        for (boolean[] i : board) {
            for (boolean j : i) {
                if (j) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.err.println("");
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (row - 2 >= 0 && col + 1 < board.length && board[row - 2][col + 1]) {
            return false;
        }
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1]) {
            return false;
        }
        if (row - 1 >= 0 && col + 2 < board.length && board[row - 1][col + 2]) {
            return false;
        }
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2]) {
            return false;
        }
        return true;

    }

}
