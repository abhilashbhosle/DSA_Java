
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,1,1,2,0,0};
        int[] ans = sort(arr);
		System.out.println(Arrays.toString(ans));
    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
		System.out.println(Arrays.toString(left)+"left");
		System.out.println(Arrays.toString(right)+"right");
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
		System.out.println("merge function called with"+Arrays.toString(left)+", "+Arrays.toString(right));
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArr = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                mergedArr[k] = right[j];
                j++;
            } else {
                mergedArr[k] = left[i];
                i++;
            }
            k++;
        }
        while (i < left.length) {
            mergedArr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            mergedArr[k] = right[j];
            k++;
            j++;
        }
		return mergedArr;
}
}