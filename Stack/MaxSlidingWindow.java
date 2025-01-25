
import java.util.Arrays;
import java.util.Stack;

public class MaxSlidingWindow {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] max = new int[(nums.length - k+1)];
		int[] nge=new int[nums.length];
		Stack<Integer> st=new Stack<>();
		// next greater of each element;
		for(int i=nums.length-1;i>=0;i--){
			while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
				st.pop();
			}
			if(st.isEmpty()){
				nge[i]=nums.length;
			}else{
				nge[i]=st.peek();
			}
			st.push(i);
		}
		int j=0;
		for(int i=0;i<=nums.length-k;i++){
			if(j<i){
				j=i;
			}
			while(nge[j]<i+k){
				j=nge[j];
			}
			max[i]=nums[j];
		}
		System.out.println(Arrays.toString(max));
    }
}
