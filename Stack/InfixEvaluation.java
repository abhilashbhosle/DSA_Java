
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String s = "1-(     -2)";
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                opnds.push(num);
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char opt = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int solvedData = findData(v1, v2, opt);
                    opnds.push(solvedData);
                }
                optors.pop();
            } else if (ch == '/' || ch == '+' || ch == '*' || ch == '-') {
                while (!optors.isEmpty() && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())) {
                    char op = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int solvedData = findData(v1, v2, op);
                    opnds.push(solvedData);
                }
                optors.push(ch);
            }
        }
        while (!optors.isEmpty()) {
            char op = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();
            int solvedData = findData(v1, v2, op);
            opnds.push(solvedData);
        }
		System.out.println(opnds.peek());
    }

    static int precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '/') {
            return 2;
        } else {
            return 2;
        }
    }

    static int findData(int v1, int v2, char optors) {
        if (optors == '+') {
            return v1 + v2;
        } else if (optors == '-') {
            return v1 - v2;
        } else if (optors == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}


// if there is two digit number

// For the input string "3+53/2"
// At i = 2 (character '5'):
// num = 0 * 10 + 5 = 5.
// At i = 3 (character '3'):
// num = 5 * 10 + 3 = 53.
// The loop exits at i = 4 (character '/'), so i-- brings the index back to i = 3.

