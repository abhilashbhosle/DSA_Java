public class Prime {

    public static void main(String[] args) {
        int n = 3;
        boolean[] primes = new boolean[n+1];
		if(n<2){
            System.out.println(0);
			return;
        }
        for (int i = 2; i * i < n; i++) {
			System.out.println(i);
            if (!primes[i] ) {
                for (int j = i*i; j < n; j += i) {
                    primes[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                count++;
            }
        }
		System.out.println(count);
    }
}
