
public class MissingPositive {

    public static void main(String args[]) {
        int nums[] = {7,8,9,11,12};
        int ans = firstMissingPositive(nums);
		System.out.println(ans);
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i]<nums.length) {
                int correct = nums[i] - 1;
                // Swap nums[i] with nums[correct] if it's not in the right place
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
		for(int j=0;j<nums.length;j++){
			if(nums[j]!=j+1){
				return j+1;
			}
		}
		return nums[nums.length-1]+1;
    }
}
