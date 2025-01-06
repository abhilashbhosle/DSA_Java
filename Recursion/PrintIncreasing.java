public class PrintIncreasing{
	public static void main(String[] args) {
		int num=5;
		printInc(num);
	}
	static void printInc(int num){
		if(num==0){
			return;
		}
		printInc(num-1);
		System.out.println(num);
	}
}