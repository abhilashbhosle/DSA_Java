
public class LastOccurence {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 6, 2, 4};
        int id = 0;
        int data = 3;
        int ans = findOccurence(arr, id, data);
        System.out.println(ans);
    }

    static int findOccurence(int[] arr, int id, int data) {
        if (id == arr.length) {
            return -1;
        }
        int ans = findOccurence(arr, id + 1, data);
        if (ans == -1) {
            if (arr[id] == data) {
                return id;
            } else {
                return -1;
            }
        } else {
            return ans;
        }
    }
}
