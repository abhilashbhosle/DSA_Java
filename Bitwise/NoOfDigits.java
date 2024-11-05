
// showing the number of digits in binary format for given value n.

public class NoOfDigits {

    public static void main(String[] args) {
        int n = 6;
        int base = 2;
        int ans = (int) (Math.log(n) / Math.log(base)) + 1;
        System.out.println(ans);
    }
}
