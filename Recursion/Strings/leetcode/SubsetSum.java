
import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {

    public static void main(String[] args) {
        int[] arr = {2, 3};
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<Integer> ans = findSubset(arr, p, subset, 0);
		Collections.sort(ans);
		System.out.println(ans);
    }
	static ArrayList<Integer> findSubset(int[] arr,ArrayList<Integer> p, ArrayList<Integer> subset, int index){
        if(index>=arr.length){
            int sum=findSum(p);
            subset.add(sum);
            return subset;
        }
        p.add(arr[index]);
        findSubset(arr,p,subset,index+1);
        p.remove(p.size()-1);
        findSubset(arr,p,subset,index+1);
        return subset;
    }
	static int findSum(ArrayList<Integer> p){
        int sum=0;
         for (int i = 0; i < p.size(); i++) {
            sum += p.get(i); // Access elements in ArrayList correctly
        }
        return sum;
    }
}
