public class TrappingRainWater{
	public static void main(String[] args) {
		int[] height={4,2,0,3,2,5};
		int ans=findtrappedWater(height);
		System.out.println(ans);
	}
	static int findtrappedWater(int[] height){
		int left=0;
		int right=height.length-1;
		int leftMax=0;
		int rightMax=0;
		int total=0;
		while(left!=right){
			if(height[left]<=height[right]){
				if(height[left]>=leftMax){
					leftMax=height[left];
				}else{
					total=total+(leftMax-height[left]);
				}
				left++;
			}else{
				if(height[right]>=rightMax){
					rightMax=height[right];
				}else{
					total=total+(rightMax-height[right]);
				}
				right--;
			}
		}
		return total;
	}
}