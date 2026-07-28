class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i< n; i++){
            if(nums[i] == count){
                count++;
            }
            
        }
        return count;
    }
}