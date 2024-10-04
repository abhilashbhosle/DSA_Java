
public class CapacityToShip {

    public static void main(String[] args) {
        int[] weights = {10, 50, 100, 100, 50, 100, 100, 100};
        int days = 5;
        int ans = shipWithinDays(weights, days);
        System.out.println(ans);
    }

    static int shipWithinDays(int[] weights, int days) {
        int low = maximum(weights);
        int high = sumOfAllDays(weights);
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (getDays(weights,days, mid) <= days) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    static int sumOfAllDays(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum = sum + weight;
        }
        return sum;
    }

    static int getDays(int[] weights, int days, int mid) {
        int sum = 0;
        int count = 1;
        for (int weight : weights) {
            int w = sum + weight;
            if (w <= mid) {
                sum = sum + weight;
            } else {
                count += 1;
                sum = weight;
            }
        }
        return count;
    }

    static int maximum(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}
