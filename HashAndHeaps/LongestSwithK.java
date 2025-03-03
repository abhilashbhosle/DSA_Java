
import java.util.HashMap;

public class LongestSwithK {

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        int ans = longestkSubstr(s, k);
        System.out.println(ans);
    }

    public static int longestkSubstr(String s, int k) {
        int i = -1;
        int j = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = -1;
        while (true) {
            boolean b1 = false;
            boolean b2 = false;
            while (i < s.length() - 1) {
                b1 = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.size() < k) {
                    continue;
                } else if (map.size() == k) {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                } else {
                    break;
                }
            }
            while (j < i) {
                b2 = true;
                j++;
                char ch = s.charAt(j);
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
                if (map.size() > k) {
                    continue;
                } else if (map.size() == k) {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                    break;
                }
            }
            if (b1 == false && b2 == false) {
                break;
            }
        }
        return ans;
    }
}
