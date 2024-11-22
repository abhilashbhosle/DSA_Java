
import java.util.ArrayList;
import java.util.List;

public class SubsetArrayRecursive {

    public static void main(String[] args) {
        int[] n = {1, 2, 3};
        List<List<Integer>> outer = new ArrayList<>();
		int index=0;
        List<Integer> inner = new ArrayList<>();
        outer.add(new ArrayList<>());
        findSubsets(n,index, outer, inner);
        System.out.println(outer);
    }

    static void findSubsets(int[] n,int index, List<List<Integer>> outer, List<Integer> inner) {
		int start=0;
		if(index==n.length){
			return;
		}
        int size = outer.size();
		if(size==2*n.length){
			return;
		}
        while (start < size) {
            inner = new ArrayList<>(outer.get(start));
            inner.add(n[index]);
            outer.add(inner);
            start++;
        }
        findSubsets(n,index+1, outer, inner);
    }
}
