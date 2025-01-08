
import java.util.Arrays;


public class AllOccurences {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 3, 6, 4};
        int[] ans = allIndices(arr, 3, 0, 0);
		System.out.println(Arrays.toString(ans));
    }
    static int[] allIndices(int[] arr, int target, int index, int foundSoFar) {
		if(index==arr.length){
			return new int[foundSoFar];
		}
        if (arr[index] == target) {
            int[] arri = allIndices(arr, target, index + 1, foundSoFar + 1);
			 arri[foundSoFar]=index;
			 return arri;
        } else {
            int[] arri = allIndices(arr, target, index + 1, foundSoFar);
			return arri;
        }
    }
}
