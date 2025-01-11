
import java.util.Arrays;

public class CrossWordPuzzle {

    public static void main(String[] args) {
        char[][] arr = {
            {'+', '-', '+'},
            {'-', '-', '-'},
            {'+', '-', '+'}
        };
        String[] words = {"and", "ant"};
        printPuzzle(arr, words, 0);
    }

    static void printPuzzle(char[][] arr, String[] words, int idx) {
        if (idx == words.length) {
            for (char[] row : arr) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println("");
            return;
        }
        String word = words[idx];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == '-' || arr[i][j] == word.charAt(0)) {
                    if (canPlaceHorizontally(arr, word, i, j)) {
                        boolean[] placedH = placeHorizontally(arr, word, i, j);
                        printPuzzle(arr, words, idx + 1);
                        unPlaceHorizontally(arr, word, i, j, placedH);
                    } else if (canPlaceVertically(arr, word, i, j)) {
                        boolean[] placedV = placeVertically(arr, word, i, j);
                        printPuzzle(arr, words, idx + 1);
                        unPlaceVertically(arr, word, i, j, placedV);
                    }
                }
            }
        }
    }

    static boolean canPlaceHorizontally(char[][] arr, String word, int i, int j) {
        if (j - 1 >= 0 && arr[i][j - 1] != '+') {
            return false;
        }
        if (j + word.length() > arr[0].length || (j + word.length() < arr[0].length && arr[i][j + word.length()] != '+')) {
            return false;
        }
        for (int jj = 0; jj < word.length(); jj++) {
            if (j + jj >= arr[0].length) {
                return false;
            }
            if (arr[i][j + jj] == '-' || arr[i][j + jj] == word.charAt(jj)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    static boolean canPlaceVertically(char[][] arr, String word, int i, int j) {
        if (i - 1 >= 0 && arr[i - 1][j] != '+') {
            return false;
        }
        if (i + word.length() > arr.length || (i + word.length() < arr.length && arr[i + word.length()][j] != '+')) {
            return false;
        }
        for (int ii = 0; ii < word.length(); ii++) {
            if (i + ii >= arr.length) {
                return false;
            }
            if (arr[i + ii][j] == '-' || arr[i + ii][j] == word.charAt(ii)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    static boolean[] placeHorizontally(char[][] arr, String word, int i, int j) {
        boolean[] wePlaced = new boolean[word.length()];
        for (int jj = 0; jj < word.length(); jj++) {
            if (arr[i][j + jj] == '-') {
                arr[i][j + jj] = word.charAt(jj);
                wePlaced[jj] = true;
            }
        }
        return wePlaced;
    }

    static boolean[] placeVertically(char[][] arr, String word, int i, int j) {
        boolean[] wePlaced = new boolean[word.length()];
        for (int ii = 0; ii < word.length(); ii++) {
            if (arr[i + ii][j] == '-') {
                arr[i + ii][j] = word.charAt(ii);
                wePlaced[ii] = true;
            }
        }
        return wePlaced;
    }

    static void unPlaceHorizontally(char[][] arr, String word, int i, int j, boolean[] placed) {
        for (int jj = 0; jj < word.length(); jj++) {
            if (placed[jj] == true) {
                arr[i][j + jj] = '-';
            }
        }
    }

    static void unPlaceVertically(char[][] arr, String word, int i, int j, boolean[] placed) {
        for (int ii = 0; ii < word.length(); ii++) {
            if (placed[ii] == true) {
                arr[i + ii][j] = '-';
            }
        }
    }
}
