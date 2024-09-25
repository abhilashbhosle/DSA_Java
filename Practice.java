
public class Practice {

    public static void main(String[] args) {
        int[] nums = {1,3,1};
        int ans = minimumMountainRemovals(nums);
        System.out.println(ans);
    }

    static int minimumMountainRemovals(int[] nums) {
        int peakIndex = findPeak(nums);
        int start = 0;
        int end = nums.length - 1;
        int count = 0;
        int left = peakIndex - 1;
        int right = peakIndex + 1;
        if (nums[peakIndex] == nums[peakIndex - 1]) {
            count++;
        }
        while (left > start) {

            if (nums[left] <= nums[left + 1] && nums[left] >= nums[left - 1]) {
                left--;
            } else {
                left--;
                count++;
            }
        }
        if (nums[peakIndex] == nums[peakIndex + 1]) {
            count++;
        }
        while (right < end) {

            if (nums[right] >= nums[right + 1] && nums[right] <= nums[right - 1]) {
                right++;
            } else {
                right++;
                count++;
            }
        }
        return peakIndex;
    }

    static int findPeak(int[] nums) {
        int end = nums.length - 1;
        int start = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
