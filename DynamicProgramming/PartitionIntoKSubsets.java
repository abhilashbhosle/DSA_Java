public class PartitionIntoKSubsets{
	public static void main(String[] args) {
		int n=5;
        int k=4;
        int[][] dp=new int[k+1][n+1];
	    for(int row=0; row<dp.length; row++){
			for(int col=0; col<dp[0].length; col++){
				if(row==0 || col==0){
					dp[row][col]=0;
				}
				else if(row==1){
					dp[row][col]=1;
				}
				else if (row>col) {
					dp[row][col]=0;
				}
				else if(row==col){
					dp[row][col]=1;
				}else{
					dp[row][col]=(row*dp[row][col-1])+(dp[row-1][col-1]);
				}
			}
		}
		System.out.println(dp[k][n]);
	}
}