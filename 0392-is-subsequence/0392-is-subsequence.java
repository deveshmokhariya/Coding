class Solution {

    public boolean isSubsequence(String s, String t) {
        return isSubsequence(s, t, t.length(), s.length());
    }

    public boolean isSubsequence(String s, String t, int m, int n) {

        if (n == 0) {
            return true;
        }

        if (m == 0) {
            return false;
        }

        if (t.charAt(m - 1) == s.charAt(n - 1)) {
            return isSubsequence(s, t, m - 1, n - 1);
        } else {
            return isSubsequence(s, t, m - 1, n);
        }
    }
}