import java.util.Arrays;
import java.util.Stack;
public class StockSpanner{
	public static void main(String[] args) {
		int[] nums={100,80,60,70,60,75,85};
		Stack<Integer> st=new Stack<>();
		int[] span=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			while(!st.isEmpty() && nums[i]>=nums[st.peek()]){
				st.pop();
			}
			if(st.isEmpty()){
				span[i]=i+1;
			}else{
				span[i]=i-st.peek();
			}
			st.push(i);
		}
		System.out.println(Arrays.toString(span));
	}
}