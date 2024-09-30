public class NthRoot{
	public static void main(String[] args) {
		int x=125;
		int n=3;
		int ans=findRoot(x, n);
		System.out.println(ans);
	}
	static int findRoot(int x,int n){
		int low=1;
		int high=x;
		while(low<=high){
			int mid=(high+low)/2;
			if(rootValue(mid, n)>x){
				high=mid-1;
			}
			else if(rootValue(mid, n)<x){
				low=mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	static int rootValue(int mid,int n){
		int value=1;
		for(int i=1;i<=n;i++){
			value=value*n;
		}
		return value;
	}
}