public class Sqrt {

    public static void main(String[] args) {
        int x = 2147395599;
        int ans = mySqrt(x);
        System.out.println(ans);
    }

    static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int low = 1;
        int high = x;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Correct calculation of mid
            long midSquared = (long) mid * mid;  // Use long to avoid overflow
            
            if (midSquared == x) {
                return mid;
            } else if (midSquared > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;  // Return the floor value of the square root
    }
}
