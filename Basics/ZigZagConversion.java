
//Leet code 6
import java.util.ArrayList;
public class ZigZagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String ans = zigZag(s, numRows).toString();
        System.out.println(ans);
    }

    static StringBuilder zigZag(String s, int numRows) {
        if (numRows == 1) {
            return new StringBuilder(s);
        }
        ArrayList<ArrayList<Character>> arr = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            arr.add(new ArrayList<>());
        }
        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            arr.get(row).add(s.charAt(i));
            if (down) {
                row++;
                if (row == numRows-1) {
                    down = false;
                }

            } else {
                row--;
                if (row == 0) {
                    down = true;
                }
            }
        }
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < numRows; i++) {
            for (char element:arr.get(i)) {
				ans.append(element);
            }
        }
        return ans;
    }
}
