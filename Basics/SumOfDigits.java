
public class SumOfDigits {

    public static void main(String[] args) {
        int n = 38;
        n = sum(n);
        System.out.println(n);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }
}
