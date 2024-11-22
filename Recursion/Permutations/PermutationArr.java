
import java.util.ArrayList;
import java.util.List;

public class PermutationArr{
	public static void main(String[] args) {
		int[] nums={1,2,3};
		List<List<Integer>> outer=new ArrayList<>();
		List<List<Integer>> ans=findPermutation(nums,outer);
		System.out.println(ans);
	}
	static List<List<Integer>> findPermutation(int[] nums,List<List<Integer>> outer){
		if(nums.length==0){
			return outer;
		}
		List<Integer> inner=new ArrayList<>();
		int n=nums[0];
		for(int i=0;i<=inner.size();i++){
			inner.add(0,i);
			inner.add(n);
			inner.add(i,inner.size());
			outer.add(inner);
			int[] num=numSlicer(nums[i],nums);
			return findPermutation(num, outer);
		}
		return outer;
	}
	static int[] numSlicer(int remove,int[] nums){
		int k=0;
		int count=0;
		for(int j=0;j<nums.length;j++){
			if(remove!=nums[j]){
				count++;
			}
		}
		int[] newNum=new int[count];
		for(int num:nums){
			if(remove!=num){
				newNum[k]=num;
				k++;
			}
		}
		return newNum;

	}
}