import java.util.Stack;

class NSE{
	private final Stack<Integer> st;
	public NSE(){
		st=new Stack<>();
	}
	public int[] findNearestSmaller(){
		int[] nums={4,5,2,8,10};
		int n=nums.length;
		int[] op=new int[n];
		for(int i=nums.length-1;i>=0;i--){
			while(!st.isEmpty() && st.peek()>=nums[i]){
				st.pop();
			}
			if(st.isEmpty()){
				op[i]=-1;
			}else{
				op[i]=st.peek();
			}
			st.push(nums[i]);
		}
		return op;
	}
}