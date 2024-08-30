
public class OrderAgnosticBs {

    public static void main(String[] args) {
        // int[] array = {2, 3, 6, 9, 12, 18};
        int[] array = {18,12,9,6,3,2};
        int target = 18;
        int ans = Search(array, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean asc = arr[start] < arr[end];
		System.out.println(asc);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (asc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
