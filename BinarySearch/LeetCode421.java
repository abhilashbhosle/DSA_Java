
//SPLIT ARRAY LARGEST SUM

public class LeetCode421 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        int ans = splitArray(nums, k);
        System.out.println(ans);
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum+num > mid) {
                    sum = num;
                    pieces += 1;
                } else {
                    sum += num;
                }
            }
            if (pieces <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;  // you can return mid or start also since at this point mid=start=end
    }
}
