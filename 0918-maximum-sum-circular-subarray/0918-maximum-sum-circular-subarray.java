class Solution {
    public int maxSubarraySumCircular(int[] nums) {


        int totalSum = 0;

        int currentMax = 0;
        int maximumSum = nums[0];

        int currentMin = 0;
        int minimumSum = nums[0];

        for (int num : nums) {
            totalSum += num;

            currentMax = Math.max(num, currentMax + num);
            maximumSum = Math.max(maximumSum, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minimumSum = Math.min(minimumSum, currentMin);
        }

   
        if (maximumSum < 0) {
            return maximumSum;
        }


        return Math.max(maximumSum, totalSum - minimumSum);
    }
}
    
