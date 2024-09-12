
public class DupsInRotatedBs {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int ans = findTarget(nums, target);
        System.out.println(ans);
    }

    static int findTarget(int[] nums, int target) {
        int pivot = findPivot(nums);
		if (pivot == -1) {
            return BiarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        
        if (target >= nums[0]) {
            return BiarySearch(nums, target, 0, pivot - 1);
        } else {
            return BiarySearch(nums, target, pivot + 1, nums.length - 1);
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

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end>start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if ( nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
