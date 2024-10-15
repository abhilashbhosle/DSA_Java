

public class MissingNum {

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = sort(arr);
        System.out.println(ans);
    }

    static int sort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i];
            if (arr[i] == n) {
                i++;
            } else if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
		return i;
    }
}
