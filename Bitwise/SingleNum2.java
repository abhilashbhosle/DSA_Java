
public class SingleNum2 {

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    count++;
                }
            }
            if (count % 3 == 1| count==1) {
                ans = ans | (1 << i);
            }
        }
        System.out.println(ans);
    }
}
// Time complexity O(32*N)
