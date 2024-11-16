
// Leetcode 28
import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String args[]) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
		for(int i=0;i<1<<n;i++){
			List<Integer> subset=new ArrayList<>();
			for(int j=0;j<nums.length;j++){
				if((i & 1<<j)!=0){
					subset.add(nums[j]);
				}
			}
			ans.add(subset);
		}
		System.out.println(ans);
    }
}
//Time Complexity(2^N*N);
