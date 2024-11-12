public class Prime{
	public static void main(String[] args) {
		int n=5;
		boolean[] primes=new boolean[n];

		if(n<=1){
			System.out.println(0);
		}

		for(int i=2;i*i<n;i++){
			for(int j=i*i;j<n;j=j+i){
				if(!primes[j]){
					primes[j]=true;
				}
			}
		}
		int count=0;
		for(int i=2;i<n;i++){
			if(!primes[i]){
				count++;
			}
		}
		System.out.println(count);
	}
}