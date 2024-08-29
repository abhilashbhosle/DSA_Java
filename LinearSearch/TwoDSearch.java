
import java.util.Arrays;

public class TwoDSearch{
	public static void main(String[] args) {
		int[][] arr={
			{1,34,13},
			{21,45,-10},
			{22,33,66,77}
		};
		int target=33;
		int[] ans= Search(arr, target);
		System.out.println(Arrays.toString(ans));

	}
	static int[] Search(int[][] arr, int target){
		for(int row=0; row<arr.length; row++){
			for(int col=0;col<=arr[row].length; col++){
				if(arr[row][col]==target){
				return new int[] {row,col};
				}
			}
		}	
		return new int[] {-1,-1};

	}
}