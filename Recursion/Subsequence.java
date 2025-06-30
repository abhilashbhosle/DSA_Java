
import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        ArrayList<String> ans = findSubsequence(up, p);
        System.out.println(ans);
    }

    static ArrayList<String> findSubsequence(String up, String p) {
        if(up.isEmpty()){
            ArrayList<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
       char c=up.charAt(0);
       ArrayList<String> left= findSubsequence(up.substring(1), p+c);
       ArrayList<String> right= findSubsequence(up.substring(1), p);
       left.addAll(right);
       return left;
    }
}
