// It returns greatest number less then or equall to target.

public class Floor {

    public static void main(String[] args) {
		int[] arr={1,4,8,14,16,20,32};
		int target=15;
		int ans=findCeiling(arr, target);
		System.out.println(ans);
    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
