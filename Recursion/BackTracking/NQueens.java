
import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(findPaths(board, 0));
        List<List<String>> ans = findPathsArray(board, n, 0);
        System.out.println(ans);
    }

    static int findPaths(boolean[][] board, int row) {
        if (row == board.length) {
            printPossiblePath(board);
            System.out.println("");
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += findPaths(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static void printPossiblePath(boolean[][] board) {
        for (boolean[] i : board) {
            for (boolean j : i) {
                if (j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }
    //==== Reaturning arraylist=====//

    static List<String> displayBoardArray(boolean[][] board) {
        List<String> list = new ArrayList<>();
        for (boolean[] i : board) {
            String p = "";
            for (boolean j : i) {
                if (j) {
                    p = p + "Q";
                } else {
                    p = p + ".";
                }
            }
            list.add(p);
        }
        return list;
    }

    static List<List<String>> findPathsArray(boolean[][] board, int n, int row) {
        if (row == board.length) {
            List<List<String>> paths = new ArrayList<>();
            paths.add(displayBoardArray(board));
            return paths;
        }
        List<List<String>> list = new ArrayList<>();
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                list.addAll(findPathsArray(board, n, row + 1));
                board[row][col] = false;
            }
        }
        return list;
    }

}
