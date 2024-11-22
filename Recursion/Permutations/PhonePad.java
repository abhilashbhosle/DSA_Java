
import java.util.ArrayList;
import java.util.List;

// leetcode 17

public class PhonePad{
	public static void main(String[] args) {
		// pad("", "12");
		List<String> ans=padArray("", "12");
		System.out.println(ans);
	}
	static void pad(String p, String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		int digit=up.charAt(0)-'0';
		for(int i=(digit-1)*3;i<digit*3;i++){
			char charToAdd=(char) ('a'+i);
			pad(p+charToAdd, up.substring(1));
		}
	}


    static List<String> padArray(String p, String up) {
        if (up.isEmpty()) {
			List<String> co=new ArrayList<>();
			co.add(p);
            return co;
        }
        int digit = up.charAt(0) - '0';
        List<String> comb = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char charToAdd = (char) ('a' + i);
            comb.addAll(padArray(p + charToAdd, up.substring(1)));
        }
		return comb;
    }
}