
import java.util.ArrayList;
import java.util.List;

public class SubsetArray2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<Integer> p = new ArrayList<>();
		List<List<Integer>> subset=new ArrayList<>();
   
		System.out.println(findSubSet(nums, p, 0,subset));
    }

    static List<List<Integer>> findSubSet(int[] up, List<Integer> p, int index,List<List<Integer>> subset) {
        if (index >= up.length) {
			System.out.println(p);
			subset.add(new ArrayList<>(p));
            return subset;
        }
        p.add(up[index]);
        findSubSet(up, p, index + 1,subset);
		p.remove(p.size()-1);
        findSubSet(up, p, index + 1,subset);
		return subset;
    }
}
