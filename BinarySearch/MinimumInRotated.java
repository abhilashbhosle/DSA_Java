public class MinimumInRotated{
	public static void main(String[] args) {
		int[] nums={4, 5, 6, 7, 0, 1, 2};
		int ans=findMinimum(nums);
		System.out.println(ans);
	}

	static int findMinimum(int[] nums){
		int pivot=findPivot(nums);
		if(pivot==-1){
			return nums[0];
		}
		if(nums[0]>nums[pivot+1]){
			return nums[pivot+1];
		}else{
			return nums[pivot+1];
		}

	}
	static int findPivot(int[] nums){
		int start=0;
		int end=nums.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(nums[mid]>nums[mid+1] && mid<end){
				return mid;
			}
			if(nums[mid]<nums[mid-1] && mid>start){
				return mid-1;
			}
			if(nums[start]>=nums[mid]){
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		return -1;
	}
}