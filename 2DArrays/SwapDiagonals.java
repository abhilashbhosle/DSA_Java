
import java.util.Arrays;


public class SwapDiagonals {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int row = 0;
        int col = 0;
        int n = arr.length - 1;
        while (row <= n && col <= n) {
            if (row == col) {
                int temp = arr[row][col];
                arr[row][col] = arr[row][n - col];
                arr[row][n - col] = temp;
            }
            row++;
            col++;
        }
		System.out.println(Arrays.deepToString(arr));
    }
	
}
