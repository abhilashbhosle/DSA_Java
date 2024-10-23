	//  *****
    //   ****
    //    ***
    //     **
    //      *

	public class Pattern6{
		public static void main(String[] args) {
			int n=5;
			pattern(n);
		}
		static void pattern(int n){
			for(int row=0; row<n ; row++){
				for(int col=0;col<n;col++){
					if(col>=row){
						System.err.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}