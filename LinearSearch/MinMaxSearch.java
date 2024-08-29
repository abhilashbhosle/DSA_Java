
public class MinMaxSearch {
    public static void main(String[] args) {
		int[] array={22,-33,4,78,29,45};
		System.out.println(MinSearch(array));
		System.out.println(MaxSearch(array));
    }
	 static int MinSearch(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int MaxSearch(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
