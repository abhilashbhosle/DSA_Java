public class GCD{
	public static void main(String[] args) {
		int a=4;
		int b=9;
		int ans=gcd(a, b);
		System.out.println(ans);
	}
	static int gcd(int a,int b){
		if(a==0){
			return b;
		}
		return gcd(b%a,a);
	}
}