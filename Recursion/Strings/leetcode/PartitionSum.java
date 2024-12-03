
import java.util.Arrays;


public class PartitionSum {

    public static void main(String[] args) {
        int[] nums = {10,6,9,5,8,7,10,4,3,7,7,7,2,1,6,6};
        int k = 4;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
		if(sum%k!=0){
			System.out.println(false);
			return;
		}
		int target=sum/k;
		
        int[] alreadyFilled = new int[nums.length];
		for(int i=0;i<alreadyFilled.length;i++){
			alreadyFilled[i]=0;
		}
		System.out.println(Arrays.toString(alreadyFilled));
        boolean ans = findPartition(0, nums, k, 1, target, alreadyFilled, 0);

        System.out.println(ans);
    }

    static boolean findPartition(int i, int[] nums, int k, int bucketNum, int target, int[] alreadyFilled, int bucketSum) {
        
        if (bucketSum == target) {
            return findPartition(0, nums, k, bucketNum + 1, target, alreadyFilled, 0);
        }
        if (bucketNum == k + 1) {
            return true;
        }
        if (bucketSum > target) {
            return false;
        }
        if (i >= nums.length) {
            return false;
        }
        if (alreadyFilled[i] == 1) {
            return findPartition(i + 1, nums, k, bucketNum, target, alreadyFilled, bucketSum);
        } else {
            //pick
            alreadyFilled[i] = 1;
            bucketSum += nums[i];
            boolean option1 = findPartition(i + 1, nums, k, bucketNum, target, alreadyFilled, bucketSum);

            // not pick
            alreadyFilled[i] = 0;
            bucketSum -= nums[i];
            boolean option2 = findPartition(i + 1, nums, k, bucketNum, target, alreadyFilled, bucketSum);

            return option1 | option2;
        }
    }
}
