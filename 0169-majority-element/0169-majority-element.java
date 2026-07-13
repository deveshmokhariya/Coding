class Solution {
    public int majorityElement(int[] nums) {


        int n = nums.length;

        int candidate = nums[0];
        int count = 1;

        // Step 1: Find possible majority element
        for (int i = 1; i < n; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        // Step 2: Verify candidate
        count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }

        return -1;
    

    }
}