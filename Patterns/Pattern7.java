    //     *
//    ***
//   *****
//  *******
// *********

public class Pattern7 {

    public static void main(String[] args) {
        int n = 7;
        pattern(n);
    }

    static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            // spaces
            for (int i = 0; i < n - row; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
