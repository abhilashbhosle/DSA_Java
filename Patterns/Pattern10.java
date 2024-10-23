// 15.      *
//         * *
//        *   *
//       *     *
//      *       *
//       *     *
//        *   *
//         * *
//          *

public class Pattern10{
	public static void main(String[] args) {
		int n=4;
		pattern(n);
	}
	static void pattern(int n){
		for(int row=1;row<=2*n-1;row++){
			int totalSpaces=row>n?2*n-row:row;
			//spaces
			for(int i=1;i<=n-totalSpaces;i++ ){
				System.out.print(" ");
			}
			//cols
			int cols=2*totalSpaces-1;
			for(int col=1; col<=cols; col++){
				if(col==1 || col==cols){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.err.println("");
		}
	}
}