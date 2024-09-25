public class LongestMountainArray{
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,4,3,2,1,0};
        int ans = longestMountain(nums);
        System.out.println(ans);
	}
	static int longestMountain(int[] arr) {
        int n = arr.length;
        int longest = 0;
        for (int i = 1; i < n - 1; i++) {
            // Find a peak element
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                // Count the length of the left side of the mountain
                int left = i - 1;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Count the length of the right side of the mountain
                int right = i + 1;
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Calculate the total length of the mountain
                int mountainLength = right - left + 1;
                longest = Math.max(longest, mountainLength);

                // Move `i` to `right` to skip unnecessary comparisons
                // i = right;
            }
        }

        return longest >= 3 ? longest : 0;  // Mountain length should be at least 3
    }
}