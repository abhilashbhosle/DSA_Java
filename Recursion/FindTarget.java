public class FindTarget{
	public static void main(String[] args) {
		int[] arr={2,7,1,10,5};
		int target=11;
		int start=0;
		boolean ans= find(arr,target,start);
		System.out.println(ans);
	}
	static boolean find(int[] arr,int tar, int s){
		if(s>arr.length-1){
			return false;
		}
		return (arr[s]==tar | find(arr,tar,s+1));
	}
}