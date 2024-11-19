
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 13, 12,13};
        int start = 0;
        int count = 0;
        int[] ans = sorted(arr, start, count);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sorted(int[] arr, int start, int count) {
        if (count == arr.length - 1) {
            return arr;
        }
        if (start == arr.length - 1) {
            return sorted(arr, count + 1, count + 1);
        }
        if (arr[start] > arr[start + 1] & start < arr.length - 1 - count) {
            int temp = arr[start];
            arr[start] = arr[start + 1];
            arr[start + 1] = temp;
        }
        return sorted(arr, start + 1, count);
    }
}
