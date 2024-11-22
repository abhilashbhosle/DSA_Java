
import java.util.Arrays;

public class DuplicateNums1{
	public static void main(String[] args) {
		int[] nums={2,14,18,22,22};
		for(int i=0;i<nums.length;i++){
            boolean swapped=false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<=nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        int i=0;
		System.out.println(Arrays.toString(nums));
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
               System.out.println(true);
            }
            i++;
        }
        System.out.println(false);
	}
}