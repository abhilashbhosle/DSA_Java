// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5

public class Pattern13 {

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            //spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int i = row; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int j = 2; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
