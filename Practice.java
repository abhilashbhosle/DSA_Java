
import java.util.Arrays;
import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        int[] nums = {4, 12, 5, 3, 2, 5, 3, 2, 4, 6};
        Stack<Integer> st = new Stack<>();
        // next greater element
        // int[] nge = new int[nums.length];
        // for (int i = nums.length - 1; i >= 0; i--) {
        //     while(!st.isEmpty() && nums[i]>=st.peek()){
        //         st.pop();
        //     }
        //     if(st.isEmpty()){
        //        nge[i]=-1;
        //     }else{
        //         nge[i]=st.peek();
        //     }
        //     st.push(nums[i]);
        // }
        // System.out.println(Arrays.toString(nge));

        // previous greater element
        // int[] pge = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     while (!st.isEmpty() && nums[i] >= st.peek()) {
        //         st.pop();
        //     }
        //     if (st.isEmpty()) {
        //         pge[i] = -1;
        //     } else {
        //         pge[i] = st.peek();
        //     }
        //     st.push(nums[i]);
        // }
        // System.out.println(Arrays.toString(pge));

        // next smaller element
        // int[] nse = new int[nums.length];
        // for(int i=nums.length-1;i>=0;i--){
        //     while(!st.isEmpty() && st.peek()>=nums[i]){
        //         st.pop();
        //     }
        //     if(st.isEmpty()){
        //         nse[i]=-1;
        //     }else{
        //         nse[i]=st.peek();
        //     }
        //     st.push(nums[i]);
        // }
        // System.out.println(Arrays.toString(nse));

        // previous smaller element
        int[] pse=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && st.peek()>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(nums[i]);
        }
        System.out.println(Arrays.toString(pse));
    }

}
