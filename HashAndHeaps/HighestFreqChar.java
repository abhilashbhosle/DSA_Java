
import java.util.HashMap;

public class HighestFreqChar {
    public static void main(String[] args) {
        String str = "babcccdbabcccd";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                int gpn = hm.get(ch);
                int nn = gpn + 1;
                hm.put(ch, nn);
            } else {
                hm.put(ch, 1);
            }
        }
        char maxChar=str.charAt(0);
        int max = 0;
        for (char key : hm.keySet()) {
            int num = hm.get(key);
            if (num > max) {
                max = num;
                maxChar = key;
            }
        }
        System.out.println(maxChar);
    }
}
