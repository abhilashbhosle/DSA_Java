// Rotated binary search usually based on finding pivot depending on four cases.
// Basically to resolve the rotated bs we need to find the peak/pivot/larger number in givern array,
// so that the left and right elements of the pivot are ascending ordered.

public class RotatedBs {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = RotatedTargetSearch(arr, target);
        System.out.println(ans);
    }

    static int RotatedTargetSearch(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) { // this means the array is not rotated just do simple bs
            return BiarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return BiarySearch(arr, target, 0, pivot - 1);
        } else {
            return BiarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int BiarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            //case 1: if middle element is greater than next element obviously it is pivot since it is sorted array.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //case 2: if middle element is lesser than next element obviously it is pivot since it is sorted array.
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //case 3: if start is greater then or equall to middle then no need of searching next to mid element.
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } //case 4: if start is less then or equall to middle then no need of searching before to mid element.
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
