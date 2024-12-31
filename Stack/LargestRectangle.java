
import java.util.Stack;

public class LargestRectangle {

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        finsLargestRect(heights);
    }

    static int finsLargestRect(int[] heights) {
        int[] pse = findpse(heights);
        int[] nse = findnse(heights);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max, (heights[i] * (nse[i] - pse[i] - 1)));
        }
		System.out.println(max);
        return max;
    }

    static int[] findpse(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i); 
        }
        return pse;
    }

    static int[] findnse(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nse = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

}
