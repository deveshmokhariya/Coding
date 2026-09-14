// class Solution {
//     public int findLongestChain(int[][] pairs) {
//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
//         int chainLength = 1;
//         int chainEnd = pairs[0][1];
//         for(int i = 0; i<pairs.length; i++){
//             if(pairs[i][0] > chainEnd){
//                 chainLength++;
//                 chainEnd = pairs[i][1];
//             }
//         }
//         return chainLength;
//     }
// }
class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs,(a,b)->
            Integer.compare(a[1],b[1])
        );

        int cnt = 0;
        int prev = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(prev < pairs[i][0]){
                prev = pairs[i][1];
                cnt++;
            }
        }
        return cnt;
    }
}