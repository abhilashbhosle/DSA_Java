
import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        ArrayList<String> ans = findSubsequence(up, p);
        System.out.println(ans);
    }

    static ArrayList<String> findSubsequence(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<String> astr = new ArrayList<>();
            astr.add(p);
            return astr;
        }
        ArrayList<String> left=findSubsequence(up.substring(1), p + up.charAt(0));
        ArrayList<String> right=findSubsequence(up.substring(1), p);
        left.addAll(right);
        return left;
    }
}
