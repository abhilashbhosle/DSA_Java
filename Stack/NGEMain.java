
import java.util.List;

public class NGEMain{
	public static void main(String[] args) {
		NGE nge=new NGE();
		List<Integer> result = nge.findNge();
        System.out.println("Next Greater Elements: " + result);

	}
}