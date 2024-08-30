
public class SearchIndex {

    public static void main(String[] args) {
        int[] array = {2, 3, 6, 9, 12, 18};
        int target = 3;
        int ans = Search(array, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
