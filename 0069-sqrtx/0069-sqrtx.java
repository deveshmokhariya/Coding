class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x / 2;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long msq = (long) mid * mid;

            if (msq == x) {
                return mid;
            } 
            else if (msq > x) {
                high = mid - 1;
            } 
            else {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }
}