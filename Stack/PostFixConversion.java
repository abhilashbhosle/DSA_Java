
import java.util.Stack;

public class PostFixConversion {

    public static void main(String[] args) {
        String tokens = "264*8/+3-";
        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = 0; i < tokens.length(); i++) {
            char ch = tokens.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int vs2 = vs.pop();
                int vs1 = vs.pop();
                int vals = solve(vs1, vs2, ch);
                vs.push(vals);

                String is2 = is.pop();
                String is1 = is.pop();
                String isval = "(" + is1 + ch + is2 + ")";
				is.push(isval);

				String ps2=ps.pop();
				String ps1=ps.pop();
				String psval=ch+ps1+ps2;
				ps.push(psval);
            } else {
                vs.push(ch + '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }
		System.out.println(vs.peek());
		System.out.println(is.peek());
		System.out.println(ps.peek());
    }

    static int solve(int v1, int v2, char ch) {
        if (ch == '+') {
            return v1 + v2;
        } else if (ch == '-') {
            return v1 - v2;
        } else if (ch == '/') {
            return v1 / v2;
        } else {
            return v1 * v2;
        }
    }
}
