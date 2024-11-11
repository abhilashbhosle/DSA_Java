
public class PowerOfFour {

    public static void main(String[] args) {
        int n = 2;
        boolean ans = findPower(n);
		System.out.println(ans);
    }

    static boolean findPower(int n) {
        if ((n == 0) || (n == 2) || (n == 3)) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int count = 0;
		if(((n&(n-1))==0)){
			while(n>1){
				n>>=1;
				count++;
			}
			return count%2==0;
		}
		return false;
    }
}
