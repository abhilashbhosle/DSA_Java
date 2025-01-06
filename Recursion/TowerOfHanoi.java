public class TowerOfHanoi{
	public static void main(String[] args) {
		int n=3;
		int a=10;
		int b=11;
		int c=12;
		toh(n,a,b,c);
	}
	static void toh(int n,int a,int b,int c){
		if(n==0){
			return;
		}
		toh(n-1, a, c, b);
		System.out.println(n + "[" + a + "->" + b + "]");
		toh(n-1, c,b,a);
	}
}