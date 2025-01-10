
import java.util.ArrayList;
import java.util.Arrays;

public class NQueensEasy {

    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        boolean[][] board = new boolean[row][col];
        boolean cols[] = new boolean[row];
        boolean rdia[] = new boolean[2 * row - 1];
        boolean ldia[] = new boolean[2 * row - 1];
        solve(board, 0, cols, rdia, ldia, "");
        ArrayList<ArrayList<String>> ans = solveArray(board, 0, cols, rdia, ldia, "");
		System.out.println(ans);

    }

    static void solve(boolean[][] board, int row, boolean[] cols, boolean[] rdia, boolean[] ldia, String asf) {
        if (row == board.length) {
            System.out.println(Arrays.deepToString(board));
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if ((cols[col] == false) && (rdia[row + col] == false) && (ldia[(row - col) + (board.length - 1)] == false)) {
                board[row][col] = true;
                cols[col] = true;
                rdia[row + col] = true;
                ldia[(row - col) + (board.length - 1)] = true;
                solve(board, row + 1, cols, rdia, ldia, asf + row + "-" + col + ",");
                cols[col] = false;
                board[row][col] = false;
                rdia[row + col] = false;
                ldia[(row - col) + (board.length - 1)] = false;
            }
        }
    }

    // Path Array
    static ArrayList<ArrayList<String>> solveArray(boolean[][] board, int row, boolean[] cols, boolean[] rdia, boolean[] ldia, String asf) {
        if (row == board.length) {
            ArrayList<ArrayList<String>> list = new ArrayList<>();
            list.add(displayBoard(board));
            return list;
        }
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (int col = 0; col < board[0].length; col++) {
            if ((cols[col] == false) && (rdia[row + col] == false) && (ldia[(row - col) + (board.length - 1)] == false)) {
                board[row][col] = true;
                cols[col] = true;
                rdia[row + col] = true;
                ldia[(row - col) + (board.length - 1)] = true;
                list.addAll(solveArray(board, row + 1, cols, rdia, ldia, asf + row + "-" + col + ","));
                cols[col] = false;
                board[row][col] = false;
                rdia[row + col] = false;
                ldia[(row - col) + (board.length - 1)] = false;
            }
        }
        return list;
    }

    static ArrayList<String> displayBoard(boolean[][] board) {
        ArrayList<String> list = new ArrayList<>();
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
}
