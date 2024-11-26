public class MazewithObstacle{
	public static void main(String[] args) {
		boolean[][] maze={
			{true,true,true},
			{true,false,true},
			{true,true,true}
		};
		findPath(0, 0, "", maze);
	}
	static void findPath(int row, int col,String p, boolean[][]maze ){
		if(row==2 && col==2){
			System.out.println(p);
			return;
		}
		if(!maze[row][col]){
			return;
		}
		if(col<maze[0].length-1){
			findPath(row, col+1, p+"R", maze);
		}
		if(row<maze.length-1){
			findPath(row+1, col, p+"D", maze);
		}
	}
}