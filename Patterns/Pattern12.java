// 13.      *
//         * *
//        *   *
//       *     *
//      *********

public class Pattern12 {

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for (int row = 5; row <= 1; row--) {
            //spaces
            for (int s = 1; s <= n - row; s++) {
                if (row != n) {
                    System.out.print(" ");
                }
            }
            int spaces = 2 * row - 1;
            //columns
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (row != n) {
                    if ((col == 1 || col == spaces)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
