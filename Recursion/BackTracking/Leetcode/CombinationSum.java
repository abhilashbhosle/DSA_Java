
import java.util.ArrayList;
import java.util.List;

// Leetcode 39
public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2};
        int target = 1;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findSum(candidates, target, list, index, ans);
        System.out.println(ans);
    }

    static void findSum(int[] candidates, int target, List<Integer> list, int index, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (index == candidates.length || target < 0) {
            return;
        }
        if (candidates[index] <= target) {
            list.add(candidates[index]);
            findSum(candidates, target - candidates[index], list, index, ans);
            list.remove(list.size() - 1);
        }
        findSum(candidates, target, list, index + 1, ans);

    }
}
