// refering https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
// *
// **
// ***
// ****
// *****

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
			for(int col=1;col<=row;col++){
				System.out.print("* ");
			}
			System.out.println("");
        }
    }
}
