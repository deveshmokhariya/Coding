class Solution {


    public int alternatingSubarray(int[] nums) {
        int n = nums.length;
        int res = -1;

        for (int i = 0; i < n - 1; i++) {

            if (nums[i + 1] - nums[i] == 1) {
                int curr = 2;
                int expected = -1;

                for (int j = i + 1; j < n - 1; j++) {
                    if (nums[j + 1] - nums[j] == expected) {
                        curr++;
                        expected = expected * -1;
                    } else {
                        break;
                    }
                }

                res = Math.max(res, curr);
            }
        }

        return res;
    }
}
    
