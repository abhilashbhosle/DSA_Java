
public class MaxConsOne {

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
	
        int count = 0;
        int ans = -1;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0 && nums[i]==1) {
                ans = nums[i];
                count++;
            } else {
                if (nums[i] == ans) {
                    count++;
                } else {
                    count=0;
                }
            }
			if(max<count){
				max=count;
			}
        }
        System.out.println(max);
    }

}
