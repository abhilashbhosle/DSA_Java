
public class Practice {

    public static void main(String[] args) {
        int[][] arr = {
            {1,5},
            {7,3},
			{3,5}
        };
        int ans = findrichest(arr);
        System.out.println(ans);
    }

    static int findrichest(int[][] accounts) {
        int richest = 0;
        int holder = 0;
         for (int[] person : accounts) {
           for (int account : person) {
                holder = holder + account;
            }
            if (holder >= richest) {
                richest = holder;
            }
			holder=0;
        }
        return richest;
    }
}
