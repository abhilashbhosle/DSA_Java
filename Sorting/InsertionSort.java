
import java.util.Arrays;

// Sort all the left hand side values
// where i starts from 0 and j starts from i+1

public class InsertionSort{
	public static void main(String[] args) {
		int[] arr={5,3,4,1,2};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else{
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}