
import java.util.Arrays;

public class BubbleSort{
	public static void main(String[] args) {	
		int[] arr={2,0,2,1,1,0};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			boolean swapped=false;
			for(int j=1;j<=arr.length-1-i;j++){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped){
				break;
			}
		}
	}
}