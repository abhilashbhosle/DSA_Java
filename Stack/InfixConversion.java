
import java.util.Stack;

public class InfixConversion {

    public static void main(String[] args) {
        String s = "a*(b-c)/d+e";
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                prefix.push(ch + "");
                postfix.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    char op = ops.pop();
                    // Prefix processing
                    String prefix2 = prefix.pop();
                    String prefix1 = prefix.pop();
                    String pref = op + prefix1 + prefix2;
                    prefix.push(pref);
                    // Postfix processing
                    String postfix2 = postfix.pop();
                    String postfix1 = postfix.pop();
                    String post = postfix1 + postfix2 + op;
                    postfix.push(post);
                }
                ops.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!ops.isEmpty() && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                   char op = ops.pop();
                    // Prefix processing
                    String prefix2 = prefix.pop();
                    String prefix1 = prefix.pop();
                    String pref = op + prefix1 + prefix2;
                    prefix.push(pref);
                    // Postfix processing
                    String postfix2 = postfix.pop();
                    String postfix1 = postfix.pop();
                    String post = postfix1 + postfix2 + op;
                    postfix.push(post);
                }
                ops.push(ch);
            }
        }
        while (!ops.isEmpty()) {
            char optors = ops.pop();
            String prefix2 = prefix.pop();
            String prefix1 = prefix.pop();
            String pref = optors + prefix1 + prefix2;
            prefix.push(pref);
            String postfix2 = postfix.pop();
            String postfix1 = postfix.pop();
            String post = postfix1 + postfix2 + optors;
            postfix.push(post);
        }
        System.out.println(postfix.peek());
        System.out.println(prefix.peek());
    }

    static int precedence(char ch) {
        if (ch == '/' || ch == '*') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 0;
        }
    }
}
