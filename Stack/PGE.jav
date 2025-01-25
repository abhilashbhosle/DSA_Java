public class PGE{
	 public static void main(String[] args) {
        int[] nums = {4, 12, 5, 3, 2, 5, 3, 2, 4, 6};
        Stack<Integer> st = new Stack<>();
		 int[] pge = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && nums[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                pge[i] = -1;
            } else {
                pge[i] = st.peek();
            }
            st.push(nums[i]);
        }
        System.out.println(Arrays.toString(pge));
	 }
}