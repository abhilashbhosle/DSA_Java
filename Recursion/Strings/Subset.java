
import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        List<String> subsets = new ArrayList<>();
        // findSubsets(up,p,subsets);
        findSubsetsAscii(up, p, subsets);
        System.out.println(subsets);
    }

    static void findSubsets(String up, String p, List<String> subsets) {
        if (up.isEmpty()) {
            subsets.add(p);
            return;
        }
        findSubsets(up.substring(1), p + up.charAt(0), subsets);
        findSubsets(up.substring(1), p, subsets);
    }

    static void findSubsetsAscii(String up, String p, List<String> subsets) {
        if (up.isEmpty()) {
            subsets.add(p);
            return;
        }
        findSubsets(up.substring(1), p + up.charAt(0), subsets);
        findSubsets(up.substring(1), p, subsets);
        findSubsets(up.substring(1), p + (up.charAt(0) + 0), subsets);
    }
}
