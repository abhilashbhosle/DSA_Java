
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class NGE {

    private final Stack<Integer> st;
    private final List<Integer> list;

    public NGE() {
        st = new Stack<>();
        list = Arrays.asList(4, 12, 5, 3, 2, 5, 3, 2, 4, 6);
    }

    public List<Integer> findNge() {
        int n = list.size();
        List<Integer> nge = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            nge.add(-1);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= list.get(i)) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge.set(i, -1);
            } else {
                nge.set(i, st.peek());
            }
            st.push(list.get(i));
        }
        return nge;
    }
}
