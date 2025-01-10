public class Josephus{
	public static void main(String arge[]){
		int n=5;
		int k=2;
		findTheWinner(n, k);
		System.out.println(findTheWinner(n,k));
	}
	static int findTheWinner(int n, int k) {
        if(n==1){
            return 1;
        }
        int x=findTheWinner(n-1,k);
		// System.out.println(n);
        int y=(x+k-1)%n+1;
        return y;
    }
}