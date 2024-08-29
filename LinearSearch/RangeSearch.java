
public class RangeSearch {

    public static void main(String[] args) {
        int[] array = {1, -4, 5, 6, -7, 9};
        int target = 5;
        int ans = Search(array, target, 1, 5);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target, int min, int max) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = min; i <= max; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }
}
