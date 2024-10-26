// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1

public class Pattern14 {

    public static void main(String[] args) {
        int n = 5;
		pattern(n);
    }

    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
			int r=row>=n?2*n-row:row;
			int s=n-r;
			for(int space=1;space<=s;space++){
				System.out.print(" ");
			}
			for(int i=r; i>=1; i--){
				System.out.print(i);
			}
			for(int j=2;j<=r;j++){
				System.out.print(j);
			}
			System.out.println("");
        }
    }
}
