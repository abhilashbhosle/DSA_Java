
public class TrianglePattern {

    public static void main(String[] args) {
        int row = 5;
        int col = 0;
        // pattern(row, col);
        pattern2(row, col);
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
		if(col<row){
			System.out.print("* ");
			pattern(row, col+1);
		}else{
			System.err.println("");
			pattern(row-1, 0);
		}
    }
	 static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }
		if(col<row){
			pattern2(row, col+1);
			System.out.print("* ");
		}else{
			pattern2(row-1, 0);
			System.err.println("");
		}
    }
}
