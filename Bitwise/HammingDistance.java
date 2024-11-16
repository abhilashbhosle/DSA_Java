
// leet code 461
public class HammingDistance {
    public static void main(String[] args) {
        int x = 0001;
        int y = 0100;
        int count = 0;
        while ((x > 0) || (y > 0)) {
            if ((x & 1) != (y & 1)) {
                count++;
            }
            x >>= 1;
            y >>= 1;
        }
        System.out.println(count);
    }
}
