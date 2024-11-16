
public class ReverseOptimised {

    public static void main(String[] args) {
        int num = 1234;
        boolean sign = num >= 0;
        num = Math.abs(num);
        int digits = (int) (Math.log10(num)) + 1;
        int reversedNumber = reverse(num, digits);
        int result = sign ? reversedNumber : -reversedNumber;
        System.out.println(result);
    }

    static int reverse(int num, int digits) {
        if (num == 0 | Integer.MIN_VALUE==num | Integer.MAX_VALUE==num) {
            return 0;
        }
        int rem = num % 10;

        return (int) (rem * Math.pow(10, digits - 1) + reverse(num / 10, digits - 1));
    }
}
