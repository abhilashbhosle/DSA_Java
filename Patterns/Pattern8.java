// 9.  *********
//      *******
//       *****
//        ***
//         *

public class Pattern8 {

    public static void main(String[] args) {
        int n = 7;
        pattern(n);
    }

    static void pattern(int n) {
        for (int row = n; row >= 0; row--) {
            // spaces
            for (int i = row; i < n; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.err.print("*");
            }
			System.err.println("");
        }
    }
}
