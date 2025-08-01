
import java.util.ArrayList;

public class StairsPath {
    // climibing / coming down the stairs, if we can jump 1,2,3 stairs at a time selectively.

    //  ** Note ** == If we take steps to climb like more eg; 40 the output will be time limit exceeded,
    //                since there will be number of duplicate calls increases hence here we need to apply dp/ memorization
    public static void main(String[] args) {
        ArrayList<String> ans = getPath(4);
        System.out.println(ans);
    }

    static ArrayList<String> getPath(int n) {
        if (n == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        } else if (n < 0) {
            ArrayList<String> arr = new ArrayList<>();
			return arr;
        }
        ArrayList<String> paths1 = getPath(n - 1);
        ArrayList<String> paths2 = getPath(n - 2);
        ArrayList<String> paths3 = getPath(n - 3);
        ArrayList<String> paths = new ArrayList<>();
        for (String path : paths1) {
            paths.add(1 + path);
        }
        for (String path : paths2) {
            paths.add(2 + path);
        }
        for (String path : paths3) {
            paths.add(3 + path);
        }
        return paths;
    }
}
