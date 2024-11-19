
public class IsSorted {

    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 10, 1};
        int start = 0;
        boolean ans = findSorted(arr, start);
		System.out.println(ans);
    }

    static boolean findSorted(int[] arr, int start) {
        if (start == arr.length - 1) {
            return true;
        }
        return arr[start] < arr[start + 1] & findSorted(arr, start + 1);
    }
}
