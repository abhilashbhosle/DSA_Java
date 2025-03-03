
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnnagramMapping{

	public static class Pair{
		int idx=0;
		List<Integer> list=new ArrayList<>();
	}
	public static void main(String[] args) {
		int[] a1={2,7,9,2,8,1,1,3,9};
		int[] a2={3,1,2,9,8,1,7,9,2};
		HashMap<Integer, Pair> map=new HashMap<>();
		// store the indexes of a2
		for(int i=0;i<a2.length;i++){
			if(map.containsKey(a2[i])){
				Pair p=map.get(a2[i]);
				p.list.add(i);
			}else{
				Pair p=new Pair();
				p.list.add(i);
				map.put(a2[i],p);
			}
		}
		int[] ans=new int[a2.length];

		for(int i=0;i<a1.length;i++){
			Pair p=map.get(a1[i]);
			ans[i]=p.list.get(p.idx);
			p.idx++;
		}
		System.out.println(Arrays.toString(ans));
	}
}