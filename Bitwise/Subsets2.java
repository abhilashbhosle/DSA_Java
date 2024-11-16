
import java.util.ArrayList;
import java.util.List;

public class Subsets2{
	public static void main(String[] args) {
		int[] nums={1,2,2};
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<1<<nums.length;i++){
			List<Integer> subset=new ArrayList<>();
			for(int j=0;j<nums.length;j++){
				if((i & (1<<j))!=0){
					if((!ans.isEmpty() & !(ans.contains(nums[j])))){
						subset.add(nums[j]);
					}else{
						subset.add(nums[j]);
					}
				}
			}
			ans.add(subset);
		}
		System.out.println(ans);
	}

}