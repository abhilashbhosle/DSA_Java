
import java.util.Arrays;

public class NSEMain{
	public static void main(String[] args) {
		NSE nse=new NSE();
		int[] ans=nse.findNearestSmaller();
		// PSE pse=new PSE();
		// int[] ans=pse.previousSmallerElement();
		System.out.println(Arrays.toString(ans));
	}
}