
public class UpperTriang2D{
	public static void main(String[] args) {
		int arr[][]={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		findUpperTriangle(arr);
	}
	static void findUpperTriangle(int[][]arr){
		int row=arr.length-1;
		int column=arr[0].length-1;
		for(int i=0;i<=row;i++){
			for(int j=0;j<=column;j++){
			// we can notice to print upper triangle i<=j
				if(i<=j){
					System.out.print(arr[i][j]+" ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}