
import java.util.ArrayList;
import java.util.List;

public class SubsetArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = findSubsets(nums);
        System.out.println(subsets);
    }

    static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

		for(int num:nums){
			int n=outer.size();
			for(int i=0;i<n;i++){
				List<Integer> inner=new ArrayList<>(outer.get(i));
				inner.add(num);
				outer.add(inner);
			}
		}
        return outer;
    }

}
// Time Complexity : (N*2^N);
// Space Complexity : (N*2^N);
