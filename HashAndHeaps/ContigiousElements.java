
import java.util.HashSet;

public class ContigiousElements {

    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 5, 6, 23, 24, 22, 23, 19, 17, 16, 18, 39, 0};
        int ans = getNumber(arr);
        System.out.println(ans);
    }

    public static int getNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            int min = arr[i];
            HashSet<Integer> hash = new HashSet<>();
            hash.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (hash.contains(arr[j])) {
                    break;
                } else {
                    hash.add(arr[j]);
                    max = Math.max(max, arr[j]);
                    min = Math.min(min, arr[j]);
                }
                if (max - min == j - i) {
                    int len = j - i + 1;
                    if (len > ans) {
                        ans = len;
                    }
                }
            }
        }
        return ans;
    }
}
