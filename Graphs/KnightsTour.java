public class KnightsTour {
    public static void main(String[] args) {
        int n = 8;
        int row = 0;
        int col = 0;
        int[][] chess = new int[n][n];
        if (getKnightsPath(chess, row, col, 1)) {
            displayBoardOfChess(chess);
        } else {
            System.out.println("No solution exists");
        }
    }

    public static boolean getKnightsPath(int[][] chess, int r, int c, int move) {
        if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
            return false;
        }
        if (move == chess.length * chess.length) {
            chess[r][c] = move;
            return true; 
        }

        chess[r][c] = move;

        if (getKnightsPath(chess, r - 2, c + 1, move + 1) ||
            getKnightsPath(chess, r - 1, c + 2, move + 1) ||
            getKnightsPath(chess, r + 1, c + 2, move + 1) ||
            getKnightsPath(chess, r + 2, c + 1, move + 1) ||
            getKnightsPath(chess, r + 2, c - 1, move + 1) ||
            getKnightsPath(chess, r + 1, c - 2, move + 1) ||
            getKnightsPath(chess, r - 1, c - 2, move + 1) ||
            getKnightsPath(chess, r - 2, c - 1, move + 1)) {
            return true;
        }

        chess[r][c] = 0;
        return false;
    }

    public static void displayBoardOfChess(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.printf("%2d ", chess[i][j]);
            }
            System.out.println();
        }
    }
}
