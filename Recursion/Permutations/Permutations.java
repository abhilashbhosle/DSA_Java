
import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
        String up = "abc"; //unprocessed
        String p = ""; // processed
        // findPermutation(up,p);
        ArrayList<String> ans = findPermutationArr(up, p);
        int count = permutationsCount(up, p);
        System.out.println(count);

    }

    static void findPermutation(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            findPermutation(up.substring(1), f + c + l);
        }
    }

    static ArrayList<String> findPermutationArr(String up, String p) {
        ArrayList<String> inner = new ArrayList<>();
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            inner.addAll(findPermutationArr(up.substring(1), f + c + l));
        }
        return inner;
    }

    static int permutationsCount(String up, String p) {
        if (up.isEmpty()) {
            return 1;
        }
		int count=0;
        char c = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
           count=count+ permutationsCount(up.substring(1), f + c + l);
        }
		return count;
    }

}
