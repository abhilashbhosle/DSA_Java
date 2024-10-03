
public class MinDaysToBouquet {

    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        int ans = minDays(bloomDay, m, k);
        System.out.println(ans);
    }

    static int minDays(int[] bloomDay, int m, int k) {
		 if (bloomDay.length < m * k) {
            return -1;
        }
        int low = minBloomDay(bloomDay);
        int high = maxBloomDay(bloomDay);
       
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int possible = possibleDays(bloomDay, mid, m, k);
            if (possible >= m) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return low;
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

    static int minBloomDay(int[] bloomDay) {
        int min = bloomDay[0];
        for (int day : bloomDay) {
            min = Math.min(min, day);
        }
        return min;
    }

    static int maxBloomDay(int[] bloomDay) {
        int max = bloomDay[0];
        for (int day : bloomDay) {
            max = Math.max(max, day);
        }
        return max;
    }
}
