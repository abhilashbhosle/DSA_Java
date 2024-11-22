
public class ReduceToZero {

    public static void main(String[] args) {
        int num = 123;
        int count = 0;

        int ans = steps(num, count);
        System.out.println(ans);
    }

    static int steps(int num, int count) {
        if (num == 0) {
            return count;
        }
		if(num==1){
			return steps(num-1, count+1);
		}
        if(num%2!=0){
			return steps(num-1, count+1);
		}
		else if(num%2==0){
			return steps(num/2, count+1);
		}
		return count;
    }
}
