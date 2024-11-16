
import java.util.Arrays;
public class SingleNum2Optimised{
	public static void main(String[] args) {
		int[] nums = {2, 2, 3, 2};
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i=i+3){
			if(nums[i-1]!=nums[i]){
				System.out.println(nums[i-1]);
			}
			System.out.println(nums[nums.length-1]);
		}
	}
}
// Time complexity O(NlogN+N/3).