// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

	 static void pattern(int n) {
		for (int row = 1; row <=(2*n)-1; row++) {
			int c=row<=n?row:(2*n)-row;
			for(int col=1;col<=c;col++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	 }
}
