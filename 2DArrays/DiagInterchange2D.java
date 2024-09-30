
public class DiagInterchange2D{
	public static void main(String[] args) {
		int arr[][]={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int ans= findSum(arr);
		System.out.println("sum"+ " "+ans);
	}
	static int findSum(int[][]arr){
		int row=arr.length-1;
		int column=arr[0].length-1;
		int sum=0;
		for(int i=0;i<=row;i++){
			for(int j=0;j<=column;j++){
				// left diagonal can be found if row is equall to column;
				// right diagonal can be found if row+column indexes are equal to n-1;
				if(i==j || i+j==arr.length-1){
					sum=sum+arr[i][j];
				}
			}
		}
		return sum;
	}
}