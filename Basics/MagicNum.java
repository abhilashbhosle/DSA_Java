
public class MagicNum {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(findMagicNo(n));
    }

    static int findMagicNo(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int val = n & 1;
            n = n >> 1;
            ans = ans + base * val;
            base = base * 5;
        }
        return ans;
    }
}
