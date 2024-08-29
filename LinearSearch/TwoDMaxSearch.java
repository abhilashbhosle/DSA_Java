public class TwoDMaxSearch{
	public static void main(String[] args) {
		int[][] arr={
			{1,34,13},
			{21,45,-10},
			{22,33,66,77}
		};
		int ans=SearchMax(arr);
		System.out.println(ans);
	}
	static int SearchMax(int[][] arr){
		int max=Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++){
			for(int col=0; col<arr[row].length;col++){
				if(arr[row][col]>max){
					max=arr[row][col];
				}
			}
		}
		return max;
	}
}