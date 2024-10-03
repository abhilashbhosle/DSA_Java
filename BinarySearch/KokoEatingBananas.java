public class KokoEatingBananas{
	public static void main(String[] args) {
		int h=5;
		int[] piles={30,11,23,4,20};
		int ans=minEatingSpeed(piles, h);
		System.out.println(ans);
	}
	static int minEatingSpeed(int[] piles, int h) {
        int low=1;
		int high=getMaximum(piles);
		while(low<=high){
			int mid=low + (high - low) / 2;
			int totalHours=findTotal(piles,mid);
			if(totalHours<=h){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return low;
    }
	static int findTotal(int[] piles,int mid){
		int total=0;
		for(int i=0;i<piles.length;i++){
			total+=Math.ceil((double) piles[i]/(double) mid);
		}
		return total;
	}
	static int getMaximum(int[] piles){
		int max=piles[0];
		for(int i=0;i<piles.length;i++){
			max=Math.max(max, piles[i]);
		}
		return max;
	}
}