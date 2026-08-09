// class Solution {
//     public int strStr(String haystack, String needle) {
//        int m = needle.length(); 
//        int n = haystack.length(); 
//        for(int i = 0; i<=n-m; i++){
//         int j;
//         for(j=0; j<m; j++){
//             if(needle.charAt(j) != haystack.charAt(i+j)){
//                 break;
//             }
//         }
//         if(j==m){
//             return i;
//         }
//        }
//        return -1;
//     }
// }
class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        int[] lps = new int[m];

        // Create LPS array
        int len = 0;
        int i = 1;

        while (i < m) {

            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } 
            else {

                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } 
                else {
                    len = lps[len - 1];
                }
            }
        }

        // KMP search
        i = 0;
        int j = 0;

        while (i < n) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                // Complete pattern found
                if (j == m) {
                    return i - j;
                }
            } 
            else {

                if (j == 0) {
                    i++;
                } 
                else {
                    j = lps[j - 1];
                }
            }
        }

        return -1;
    }
}