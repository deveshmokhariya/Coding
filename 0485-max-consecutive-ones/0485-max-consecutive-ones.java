class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                curr = 0;
            }
            else{
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}