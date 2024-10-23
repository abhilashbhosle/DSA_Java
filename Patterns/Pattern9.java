// 28.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

public class Pattern9{
	public static void main(String args[]){
		int n=5;
		pattern(n);
	}
	static void pattern(int n){
		for(int row=1; row<=2*n-1; row++){
			int totalSpaces=row>n?2*n-row:row;
			// spaces
			for(int i=1;i<=n-totalSpaces;i++){
				System.out.print(" ");
			}
			for(int col=1;col<=totalSpaces;col++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}