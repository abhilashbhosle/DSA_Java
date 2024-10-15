// Cyclic sort is used when we have nums ranging from 1=>..n.
// Cyclic sort time complexity is linear O(n).
// It is solved in single shot using one loop i.e, arranging at a correct index as they are consecutive.
import java.util.Arrays;
public class CyclicSort{
	public static void main(String args[]){
		int[] arr={5,4,2,3,1};
		int i=0;
		while(i<arr.length){
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]){
				// swap
				int temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}
			else{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}