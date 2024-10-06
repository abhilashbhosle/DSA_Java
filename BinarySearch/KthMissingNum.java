public class KthMissingNum{
	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		int k=2;
		int ans=findKthPositive(arr, k);
		System.out.println(ans);
	}
	static int findKthPositive(int[] arr, int k) {
		int low=0;
		int high=arr.length-1;
		if(k<low){
			return k;
		}
		while(low<=high){
			int mid=(low+high)/2;
			int missing=arr[mid]-(mid+1);
			if(missing<k){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return  k+high+1;
    }
}