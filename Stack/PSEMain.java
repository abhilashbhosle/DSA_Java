
import java.util.Arrays;

public class PSEMain{
	public static void main(String[] args) {
		PSE pse=new PSE();
		int[] ans=pse.previousSmallerElement();
		// PSE pse=new PSE();
		// int[] ans=pse.previousSmallerElement();
		System.out.println(Arrays.toString(ans));
	}
}