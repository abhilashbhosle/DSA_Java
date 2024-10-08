
public class BooksAllocation {
    public static void main(String[] args) {
		int[] nums={25,46,28,49,24};
		int k=4;
		int ans=splitArray(nums, k);
		System.out.println(ans);
    }
	static int splitArray(int[] nums, int k) {
		int low=0;
		int high=0;
		for(int i=0;i<nums.length;i++){
			low=Math.max(low, nums[i]);
			high=high+nums[i];
		}   
		while(low<=high){
			int mid=low+(high-low)/2;
			int possibility=findMax(nums,mid);
			if(possibility<=k){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return low;
    }
	static int findMax(int[]nums,int mid){
		int count=1;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			if(sum+nums[i]>mid){
				count++;
				sum=nums[i];
			}
			else{
				sum+=nums[i];
			}
		}
		return count;
	}
}
