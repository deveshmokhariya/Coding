class Solution {
    public int mySqrt(int x) {
        int low = 1; 
        int high = x;
        int ans = 0;
        while( low <= high){
            int mid = low + (high - low)/2;
            long msq= (long)mid * mid;
            if(msq == x){
                return mid;
            }
            else if(msq > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}