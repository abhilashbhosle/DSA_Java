
import java.util.Stack;

public class Celebrity {

    public static void main(String[] args) {
        // int[][] mat = {
        //     {0, 1, 1, 1, 1},
        //     {1, 0, 0, 1, 0},
        //     {1, 0, 0, 1, 0},
        //     {0, 0, 0, 0, 0},
        //     {0, 1, 0, 1, 0},};
		int[][] mat={
			{0,1,1,0},
			{0,0,0,1},
			{1,1,0,1},
			{1,1,1,0}
		};
		if (mat.length == 1) {
            System.out.println(0); // The only person is the celebrity
            return;
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < mat.length; i++) {
            st.push(i);
        }
        while (st.size() >= 2) {
            int ind1 = st.pop();
            int ind2 = st.pop();
            if (mat[ind1][ind2] == 1) {
                st.push(ind2);
            } else {
                st.push(ind1);
            }
        }
        int top = st.pop();
        for (int i = 0; i < mat.length; i++) {
            if (i != top) {
                if (mat[i][top] == 0 || mat[top][i] == 1) {
                    System.out.println("no celebrity");
					return;
                }
            }
        }
        System.out.println(top);
    }
}
