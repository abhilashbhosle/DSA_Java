
import java.util.ArrayList;
import java.util.List;

public class PhonePadFrom2 {

    public static void main(String[] args) {
        List<String> ans = pad("", "7");
		System.out.println(ans);
    }

    static List<String> pad(String p, String up) {
        if (up.isEmpty()) {
            List<String> comb = new ArrayList<>();
            comb.add(p);
            return comb;
        }
        int digit = up.charAt(0) - '0';
		 int prevariable=digit==7|digit==8?1:digit==9?2:0;
		 int postVariable=digit==9|digit==8?1:0;
		List<String> combinations=new ArrayList<>();
        for (int i = ((digit - 2) * 3)+postVariable; i < ((digit - 1) * 3)+prevariable; i++) {
			char charToAdd=(char)('a'+i);
			combinations.addAll(pad(p+charToAdd, up.substring(1)));
        }
		return combinations;
    }
}
