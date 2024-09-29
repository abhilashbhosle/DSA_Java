
public class SortedMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = {
           {1,1},{3,3}
        };
        int target = 1;
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);
    }
  
    static boolean searchMatrix(int[][] matrix, int target) {
		int rows=matrix.length;
		int col=matrix[0].length;
		int low=0;
		int high=rows*col-1;

		while(low<=high){
			int mid=(low+high)/2;
			int row=mid/col;
			int column=mid%col;
			if(matrix[row][column]==target){
				return true;
			}
			else if(matrix[row][column]<target){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return false;

	}
}
