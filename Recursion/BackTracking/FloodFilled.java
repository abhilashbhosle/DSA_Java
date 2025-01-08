
import java.util.ArrayList;

// Similar to maze with obstacle;

public class FloodFilled {

    public static void main(String[] args) {
        int row = 6;
        int col = 7;
        int[][] arr = {
            {0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 0, 1, 1},
            {1, 0, 1, 1, 0, 1, 1},
            {1, 0, 0, 0, 0, 0, 0}
        };
        boolean[][] visited = new boolean[row][col];
        findPath(arr, 0, 0, "", visited);
        System.out.println(findPathArray(arr, 0, 0, "", visited));
    }

    static void findPath(int[][] maze, int row, int col, String p, boolean[][] visited) {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true) {
            return;
        }
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        visited[row][col] = true;
        findPath(maze, row - 1, col, p + "t", visited);
        findPath(maze, row, col - 1, p + "l", visited);
        findPath(maze, row + 1, col, p + "d", visited);
        findPath(maze, row, col + 1, p + "r", visited);
        visited[row][col] = false;
    }

	// Array
	static ArrayList<String> findPathArray(int[][] maze, int row, int col, String p, boolean[][] visited) {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true) {
            return new ArrayList<>();
        }
        if (row == maze.length - 1 && col == maze[0].length - 1) {
			ArrayList<String> path=new ArrayList<>();
			path.add(p);
            return path;
        }
        visited[row][col] = true;
		ArrayList<String> path=new ArrayList<>();
        path.addAll(findPathArray(maze, row - 1, col, p + "t", visited));
        path.addAll(findPathArray(maze, row, col - 1, p + "l", visited));
        path.addAll(findPathArray(maze, row + 1, col, p + "d", visited));
        path.addAll(findPathArray(maze, row, col + 1, p + "r", visited));
        visited[row][col] = false;
		return path;
    }
}
