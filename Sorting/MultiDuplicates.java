import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiDuplicates{
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(nums);
        System.out.println(ans); // Output should be [2, 3]
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>(); // Use ArrayList instead of emptyList

        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Swap nums[i] with nums[correct] if it's not in the right place
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
			if(nums[j]!=j+1){
				ans.add(nums[j]);
			}
		}
		Collections.sort(ans);
		return ans;
    }
}
