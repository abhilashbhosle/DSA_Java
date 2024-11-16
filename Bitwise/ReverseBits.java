// Leet code 190

public class ReverseBits {

    public static void main(String[] args) {
        String n = "00000010100101000001111010011100";
        int i = 0;
        int j = n.length() - 1;
        StringBuilder sb = new StringBuilder(n);
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        n = sb.toString();
        System.out.println(n);
    }
}
