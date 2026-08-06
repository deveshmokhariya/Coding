class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int a = n;
            int product = 1;
            while (a > 0) {
                product *= (a % 10);
                a /= 10;
            }
            if (product % t == 0) {
                return n;
            }
            n++;
        }
    }
}