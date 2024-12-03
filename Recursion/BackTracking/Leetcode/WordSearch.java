
// leetcode 79
public class WordSearch {

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        boolean ans = search(board, word);
		System.out.println(ans);
    }

    static boolean search(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == word.charAt(0)) {
                    if (searchPath(board, row, col, word, 0)) {
                        return true;
                    };
                }
            }
        }
        return false;
    }

    static boolean searchPath(char[][] board, int row, int col, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row >= board.length || col >= board[0].length || col < 0 || row < 0 || board[row][col] != word.charAt(index)) {
            return false;
        }
        char hold = board[row][col];
        board[row][col] = 0;

        boolean found = searchPath(board, row + 1, col, word, index + 1) || searchPath(board, row - 1, col, word, index + 1) || searchPath(board, row, col + 1, word, index + 1) || searchPath(board, row, col - 1, word, index + 1);

        board[row][col] = hold;
		return found;

    }
}
