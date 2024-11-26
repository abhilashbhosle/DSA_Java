
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        findPermutationSequence(n, "");
        List<String> ans = findPermutationSequenceArr(n, "");
        String KthTerm = findKthTerm(ans, k);
        System.out.println(KthTerm);
    }

    static void findPermutationSequence(int up, String p) {
        if (up == 0) {
            return;
        }
        char c = (char) ('0' + up);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            findPermutationSequence(up - 1, first + c + last);
        }
    }

    static List<String> findPermutationSequenceArr(int up, String p) {
        if (up == 0) {
            List<String> per = new ArrayList<>();
            per.add(p);
            return per;
        }
        char c = (char) ('0' + up);
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            list.addAll(findPermutationSequenceArr(up - 1, first + c + last));
        }
        return list;
    }

    static String findKthTerm(List<String> ans, int k) {
        Collections.sort(ans);
        if (k > 0 && k <= ans.size()) {
            return ans.get(k - 1);
        }
        return "";
    }
}
