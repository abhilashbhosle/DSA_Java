
import java.util.Arrays;

// Select the max item and replace it in the correct place
public class SelectionSort{
	public static void main(String args[]){
		int[] arr={5,4,3,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int last=arr.length-i-1;
			int max=0;
			for(int j=0;j<=last;j++){
				if(arr[max]<arr[j]){
					max=j;
				}
			}
			int temp=arr[last];
			arr[last]=arr[max];
			arr[max]=temp;
		}
	}
}