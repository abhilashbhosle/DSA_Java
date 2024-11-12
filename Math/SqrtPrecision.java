// finding square root with precision factor, for eg square root of 40 is 6.339.

public class SqrtPrecision{
	public static void main (String args[]){
		int n=40;
		int precision=3;
		System.out.printf("%.3f", Sqrt(n,precision));
	}
	static double Sqrt(int n,int precision){
		int start=0;
		int end=n;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(mid*mid==n){
				return mid;
			}
			if(mid*mid>n){
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		double root=0.0;
		double inc=0.1;
		for(int i=0;i<precision;i++){
			while(root*root<=n){
				root=root+inc;
			}
			root-=inc;
			inc=inc/10;
		}
		return root;
	}
}