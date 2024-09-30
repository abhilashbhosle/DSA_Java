public class BottomToTop{
	public static void main(String[] args) {
		int[][] arr={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		for(int i=0;i<arr.length;i++){
			int C=0;
			int R=i;
			printAns(C,R,arr);
		}
		for(int i=1;i<arr.length;i++){
			int C=i;
			int R=arr.length-1;
			printAns(C, R, arr);
		}
	}
	static void printAns(int C,int R,int[][] Arr){
		while(R>=0 && C<Arr.length){
			System.out.print(Arr[R][C] + " ");
			R--;
			C++;
		}
		System.out.println("");
	}
}