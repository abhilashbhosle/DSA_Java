
//leet code 169
public class MajorityElements {

    public static void main(String[] args) {
        int[] nums = {3,2,3,2,3,2,3};
        int count = 0;
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
			if(count==0){
				ans=nums[i];
				count++;
			}
			else{
				if(nums[i]==ans){
					count++;
				}else{
					count--;
				}
			}
        }
		System.out.println(ans);
    }
}
