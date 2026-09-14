// // class Solution {
// //     public int coinChange(int[] coins, int amount) {
// //         Arrays.sort(coins);
// //         int count = 0;
// //         for(int i = coins.length - 1; i>=0; i--){
           
// //                 while(coins[i] <= amount){
// //                     count++;
// //                     amount -= coins[i];
// //                 }
// //         }
// //         if(amount != 0) {
// //             return -1;
// //         }
// //         return count;
// //     }
// // }
// class Solution {
//     public int coinChange(int[] coins, int amount) {

//         Arrays.sort(coins);

//         int count = 0;

//         for(int i = coins.length - 1; i >= 0; i--) {

//             while(amount >= coins[i]) {
//                 amount -= coins[i];
//                 count++;
//             }
//         }

//         if(amount != 0) {
//             return -1;
//         }

//         return count;
//     }
// }

class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for(int i = 1; i <= amount; i++) {

            for(int j = 0; j < coins.length; j++) {

                if(coins[j] <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }

        if(dp[amount] > amount) {
            return -1;
        }

        return dp[amount];
    }
}