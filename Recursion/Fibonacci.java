
public class Fibonacci {

    public static void main(String[] args) {
        int ans = Fibo(5);
        System.out.println(ans);
    }

    static int Fibo(int num) {
        if (num <= 1) {
            return num;
        } else {
			System.out.print(Fibo(num - 1)  +"=>");
            return Fibo(num - 1) + Fibo(num - 2);
        }
    }
}
