
public class Practice {

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int left = leftSearch(nums, start, mid);
        int right = rigthSearch(nums, mid, end);
        System.out.println(left);
        System.out.println(right);
    }

    static int leftSearch(int[] nums, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid] + 1) {
                start = mid + 1;
                System.out.println(start);
            } else {
                return nums[mid];
            }
        }
        return start;
    }

    static int rigthSearch(int[] nums, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1]) {
                end = mid - 1;
            } else {
                return nums[mid];
            }
        }
        return end;
    }
}
