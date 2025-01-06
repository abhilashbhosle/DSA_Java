
public class DisplayArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 9};
        int idx = 0;
        printElements(arr, idx);
    }

    static void printElements(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printElements(arr, idx + 1);
    }

}
