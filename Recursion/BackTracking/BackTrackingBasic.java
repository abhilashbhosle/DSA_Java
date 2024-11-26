
import java.util.Arrays;

public class BackTrackingBasic {

    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        backTrack(0, 0, "", maze);
        int[][] path = new int[maze.length][maze[0].length];
        int step = 1;
        backTrackPath(0, 0, "", maze, path, step);
    }

    static void backTrack(int r, int c, String p, boolean[][] maze) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // Track the visited once and mark them as false;
        maze[r][c] = false;
        if (r < maze.length - 1) {
            backTrack(r + 1, c, p + "D", maze);
        }
        if (c < maze[0].length - 1) {
            backTrack(r, c + 1, p + "R", maze);
        }
        if (r > 0) {
            backTrack(r - 1, c, p + "U", maze);
        }
        if (c > 0) {
            backTrack(r, c - 1, p + "L", maze);
        }
        // Once the recursion calls completes for one path it comes here then remark visited paths to true.
        maze[r][c] = true;
    }

    static void backTrackPath(int r, int c, String p, boolean[][] maze, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            System.out.println(p);
            for (int[] pa : path) {
                System.out.println(Arrays.toString(pa));
            }
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // Track the visited once and mark them as false;
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            backTrackPath(r + 1, c, p + "D", maze, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            backTrackPath(r, c + 1, p + "R", maze, path, step + 1);
        }
        if (r > 0) {
            backTrackPath(r - 1, c, p + "U", maze, path, step + 1);
        }
        if (c > 0) {
            backTrackPath(r, c - 1, p + "L", maze, path, step + 1);
        }
        // Once the recursion calls completes for one path it comes here then remark visited paths to true.
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
