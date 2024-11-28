// leetcode 1219

public class PathWithMaxGold {

    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 7},
            {2, 0, 6},
            {3, 4, 5},
            {0, 3, 0},
            {9, 0, 20}
        };
        int ans = getMaxGold(grid);
        System.out.println(ans);
    }

    static int getMaxGold(int[][] grid) {
        int maxGold = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                maxGold = Math.max(maxGold, collectGold(grid, row, col));
            }
        }
        return maxGold;
    }

    static int collectGold(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }
        int gold = grid[row][col];
        //Marking the cells as visited;
        grid[row][col] = 0;

        int up = collectGold(grid, row - 1, col);
        int down = collectGold(grid, row + 1, col);
        int left = collectGold(grid, row, col - 1);
        int right = collectGold(grid, row, col + 1);
        grid[row][col] = gold;
        return gold + Math.max(Math.max(up, down), Math.max(left, right));
    }

}
