public class SmallestDivisor {

    public static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        int threshold = 5;
        int ans = smallestDivisor(nums, threshold);
        System.out.println(ans);  
    }

    static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;  
        int high = maximum(nums);
        int ans = high; 

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = findDivisor(nums, mid);

            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    static int findDivisor(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum;
    }

    static int maximum(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}
