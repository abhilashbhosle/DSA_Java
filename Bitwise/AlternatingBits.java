
public class AlternatingBits {

    public static void main(String[] args) {
        int n = 7;
        boolean ans = alterBits(n);
        System.out.println(ans);
    }

    static boolean alterBits(int n) {
        int prevBit = n & 1;
        n >>= 1;
        while (n > 0) {
            int currentBit = n & 1;
            if (currentBit == prevBit) {
                return false;
            }
            prevBit = currentBit;
            n >>= 1;
        }
        return true;
    }
}
