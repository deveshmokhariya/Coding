class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - minPrice);
            }
        }

        return profit;
    }
}

       
    
