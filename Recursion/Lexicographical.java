
import java.util.ArrayList;
import java.util.List;

// print in lexicographical order
public class Lexicographical {

    public static void main(String[] args) {
        int n = 13;
        // dfs(n,i);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            result.addAll(dfsArr(n, i));
        }
        System.out.println(result);
    }

    static void dfs(int n, int i) {
        if (i > n) {
            return;
        }
        for (int j = 0; j <= 9; j++) {
            dfs(n, 10 * i + j);
        }
    }
    // array

    static List<Integer> dfsArr(int n, int i) {
        List<Integer> list = new ArrayList<>();
        if (i > n) {
            return list;
        }
        list.add(i);
        for (int j = 0; j <= 9; j++) {
            list.addAll(dfsArr(n, 10 * i + j));
        }
        return list;
    }
}
