
public class Practice {

    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int ans = possibleDays(bloomDay, 5, m, k);
        System.out.println(ans);
    }

    static int possibleDays(int[] bloomDay, int mid, int m, int k) {
        int count = 0;
        int possibleAns = 0;
        for (int day : bloomDay) {
            if (day <= mid) {
                count = count + 1;
            } else {
                possibleAns = possibleAns + (count / k);
                count = 0;
            }
        }
        possibleAns = possibleAns + (count / k);
        return possibleAns;
    }
}
