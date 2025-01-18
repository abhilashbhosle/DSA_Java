import java.util.Stack;

 class PSE{
	private final Stack<Integer> st;
	public PSE(){
		st=new Stack<>();
	}
	public int[] previousSmallerElement(){
		int[] nums={5,2,6,1};
		int[] op=new int[nums.length];
		for(int i=0;i<nums.length;i++){
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