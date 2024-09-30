
import java.util.Arrays;

// Rotate given matrix to 90deg
// {               
// 	{1,2,3},      
// 	{4,5,6}, 
// 	{7,8,9}
// }
// TO
// {
// 	{7,4,1},
// 	{8,5,2},
// 	{9,6,3}
// }

public class RotateImage{
	public static void main(String[] args) {
		int[][] arr= {
			{1,2,3},      
 			{4,5,6}, 
 			{7,8,9}
			};
		RotateArr(arr);	
	}
	static void RotateArr(int[][] arr){
		// step 1=> Apply transpose i.e; row=>columns
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}

