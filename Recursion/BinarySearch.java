
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 33, 45, 67, 88, 92};
        int target = 88;
        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr [mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, target , s, mid - 1);
        }
        return search(arr, target , mid + 1, e);
    }
}
