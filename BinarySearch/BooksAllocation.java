
public class BooksAllocation {
    public static void main(String[] args) {
		int[] nums={7,2,5,10,8};
		int k=2;
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
		while(low<high){
			int mid=low+(high-low)/2;
			int possibility=findMax(nums,mid);
			if(possibility==k){
				return mid;
			}
			if(possibility<k){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return -1;
    }
	static int findMax(int[]nums,int mid){
		int count=0;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			if(sum+nums[i]>mid){
				count++;
				sum+=nums[i];
			}
			else{
				sum+=nums[i];
			}
		}
		return count;
	}
}
