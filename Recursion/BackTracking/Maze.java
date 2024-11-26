
public class Maze {

    public static void main(String[] args) {
        int ans = findCount(1, 1, 3, 3);
        System.out.println(ans);
    }

    static int findCount(int rowplace, int colplace, int rowdestination, int coldestination) {
        if (rowplace == rowdestination || colplace == coldestination) {
            return 1;
        }
        int right = findCount(rowplace, colplace + 1, rowdestination, coldestination);
        int down = findCount(rowplace + 1, colplace, rowdestination, coldestination);
        int total = right + down;
        return total;
    }
}
