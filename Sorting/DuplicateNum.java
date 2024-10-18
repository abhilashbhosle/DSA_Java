

public class DuplicateNum{
	public static void main(String[] args) {
		int[] nums={1,2,4,3,2};
		int ans=sort(nums);
		System.out.println(ans);
	}
	static int sort(int[] nums){
		int i=0;
		int ans=0;
		while(i<nums.length){
			int correct=nums[i]-1;
			if(nums[i]!= nums[correct]){
				int temp=nums[i];
				nums[i]=nums[correct];
				nums[correct]=temp;
			}else if(nums[i]== nums[correct] && i!=correct){
				ans= nums[correct];
				break;
			}
			else{
				i++;
			}
		}
		return ans;
	}
}