
import java.util.ArrayList;
import java.util.List;

public class MazePath {

    public static void main(String[] args) {
        findPath(3, 3, "");
        System.out.println(findPathArray(3, 3, ""));
        System.out.println(findDiagonalPathArray(3, 3, ""));
    }

    static void findPath(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (c > 1) {
            findPath(r, c - 1, p + "R");
        }
        if (r > 1) {
            findPath(r - 1, c, p + "D");
        }
    }

    static List<String> findPathArray(int r, int c, String p) {
        if (r == 1 && c == 1) {
            List<String> perm = new ArrayList<>();
            perm.add(p);
            return perm;
        }
        List<String> list = new ArrayList<>();
        if (c > 1) {
            list.addAll(findPathArray(r, c - 1, p + "R"));
        }
        if (r > 1) {
            list.addAll(findPathArray(r - 1, c, p + "D"));
        }
        return list;
    }

    static List<String> findDiagonalPathArray(int r, int c, String p) {
        if (r == 1 && c == 1) {
            List<String> perm = new ArrayList<>();
            perm.add(p);
            return perm;
        }
        List<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(findDiagonalPathArray(r - 1, c-1, p + "D"));
        }
        if (c > 1) {
            list.addAll(findDiagonalPathArray(r, c - 1, p + "H"));
        }
        if (r > 1) {
            list.addAll(findDiagonalPathArray(r - 1, c, p + "V"));
        }

        return list;
    }
}
