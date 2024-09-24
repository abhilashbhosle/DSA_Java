public class MinimumInRotated2{
	public static void main(String[] args) {
		int[] nums={1,1,3,1};
		int ans=findMin(nums);
		System.out.println(ans);
	}
	static int findMin(int[] nums) {
		int pivot=findPivotWithDups(nums);
		if(pivot==-1){
			return nums[0];
		}
		if(nums[pivot]>nums[pivot+1]){
			return nums[pivot+1];
		}else{
			return nums[pivot+1];
		}
    }
	static int findPivotWithDups(int[] nums){
		int start=0;
		int end=nums.length-1;
	
		while(start<=end){
			int mid=start+(end-start)/2;
			if(mid<end && nums[mid]>nums[mid+1]){
				return mid;
			}
			if(mid>start && nums[mid]<nums[mid-1]){
				return mid-1;
			}
			if(nums[mid]==nums[start] && nums[mid]==nums[end]){
				//ignore duplicates and also check whether the element about to ignore is pivot.
				if(start<end && nums[start]>nums[start+1]){
					return start;
				}
				start++;
				if(end>start && nums[end]<nums[end-1]){
					return end-1;
				}
				end--;
			}
			// condition to check in right side
			else if(nums[start]<nums[mid]|| (nums[start]==nums[mid] && nums[end]<nums[mid])){
				start=mid+1; 
			}
			// condition to check in left side 
			else{
				end=mid-1;
			}
		}
		return -1;
	}
}