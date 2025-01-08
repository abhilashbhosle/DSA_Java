
public class TargetSum {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 70;
        findTargets(arr, target, 0, "", 0);
    }

    static void findTargets(int[] arr, int target, int idx, String subset, int sum) {
		if(idx==arr.length){
			if(sum==target){
				System.out.println(subset);	
			}
			return;
		}
        findTargets(arr, target, idx + 1, subset+arr[idx] + ",", sum + arr[idx]);
        findTargets(arr, target, idx + 1, subset, sum);
    }
}
