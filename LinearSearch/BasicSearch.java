public class BasicSearch{
	public static void main(String[] args) {
		int[] arr={1,2,33,55,-9,-17};
		int target=-17;
		int ans=Search(arr, target);
		System.out.println(ans);
	}
	// If target is found return index of the target element, else return -1.
	static int Search(int[] arr, int target){
		if(arr.length==0){
			return -1;
		}
		for (int i = 0; i < 10; i++) {
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
}