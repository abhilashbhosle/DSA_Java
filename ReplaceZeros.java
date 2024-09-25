
import java.util.Arrays;

// replace 0 to the end of array;

public class ReplaceZeros {

    public static void main(String args[]) {
        int[] nums = {1, 0, 0, 2, 3, 4, 0, 0, 5};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
