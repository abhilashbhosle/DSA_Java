public class RBS{
	public static void main(String[] args) {
		int[] nums={3,4,6,8,1,2};
		int start=0;
		int end=nums.length-1;
		int target=4;
		int ans =search(nums, target, start, end);
		System.out.println(ans);
	}
	static int search(int[] nums,int target,int start,int end){
		if(start>end){
			return -1;
		}
		int mid=start+(end-start)/2;
		if(nums[mid]==target){
			return mid;
		}
		if(nums[start]<=nums[mid]){
			if((target>=nums[start] & target<=nums[mid])){
				return search(nums,target,start,mid-1);
			}else{
				return search(nums,target,mid+1,end);
			}
		}else if(target>=nums[mid] && target<=nums[end]){
			return search(nums,target,mid+1,end);
		}
		return search(nums,target,start,mid-1);
	}
}