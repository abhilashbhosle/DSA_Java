
import java.util.ArrayList;

public class MissingNums {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList ans = sort(arr);
        System.out.println(ans);
    }

    static ArrayList sort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        ArrayList arr1 = new ArrayList();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                arr1.add(j + 1);
            }
        }
        return arr1;
    }
}
