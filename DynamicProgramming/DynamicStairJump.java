
import java.util.Scanner;

public class DynamicStairJump {

    public static void main(String[] args) {
        int[] arr = {3, 3, 0, 2, 2, 3,2};
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(dynamicJump(arr, n));
    }

    public static int[] dynamicJump(int[] arr, int n) {
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
			for(int j=1;j<=arr[i] && j<dp.length;j++){
				dp[i]+=dp[i+j];
			}
        }
		return dp;
    }
}
