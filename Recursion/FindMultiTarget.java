// storing the duplicate target indices in list.
// without passing the list as argument, hence creating the new list at every step.

import java.util.ArrayList;
public class FindMultiTarget{
	public static void main(String args[]){
		int[] arr={1,2,4,4,2};
		int start=0;
		int target=4;
		ArrayList<Integer> ans=findTargets( arr, start, target);
		System.out.println(ans);
	}
	static ArrayList<Integer> findTargets(int[] arr,int start,int target){
		ArrayList<Integer> list=new ArrayList<>();
		if(arr.length==start){
			return list;
		}
		if(arr[start]==target){
			list.add(start);
		}
		ArrayList<Integer> allTheAns=findTargets(arr, start+1, target);
		list.addAll(allTheAns);
		return list;
	}
}