
public class AddTwoBinaryStrings {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String ans = Add(a, b);
        System.out.println(ans);
    }

    static String Add(String a, String b) {
        if (a.length() > b.length()) {
            int diff = a.length() - b.length();
            for (int i = 0; i < diff; i++) {
                b = 0 + b;
            }
        }
        if (a.length() < b.length()) {
            int diff = b.length() - a.length();
            for (int i = 0; i < diff; i++) {
                a = 0 + a;
            }
        }
        int i = a.length() - 1;
        int carry = 0;
        String sum = "";
        while (i >= 0) {
            int d1 = a.charAt(i) - '0';
            int d2 = b.charAt(i) - '0';
            int d = 0;
            if (d1 == 0 && d2 == 0) {
                if (carry == 1) {
                    d = 1;
                    carry = 0;
                } else if (carry == 0) {
                    d = 0;
                    carry = 0;
                }
            } else if (d1 == 0 && d2 == 1) {
                if (carry == 1) {
                    d = 0;
                    carry = 1;
                } else if (carry == 0) {
                    d = 1;
                    carry = 0;
                }
            } else if (d1 == 1 && d2 == 0) {
                if (carry == 1) {
                    d = 0;
                    carry = 1;
                } else if (carry == 0) {
                    d = 1;
                    carry = 0;
                }
            } else if (d1 == 1 && d2 == 1) {
                if (carry == 1) {
                    d = 1;
                    carry = 1;
                }
                if (carry == 0) {
                    d = 0;
                    carry = 1;
                }
            }
            sum = d + sum;
            i--;
        }
        if (carry == 1) {
            sum = 1 + sum;
        }
        return sum;
    }
}
