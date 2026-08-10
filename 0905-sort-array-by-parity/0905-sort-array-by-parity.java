class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int count = 0;
        int last = n-1;
        for(int i = 0; i<n; i++){
            if(nums[i]%2 == 0){
                ans[count] = nums[i];
                count++;
            }
            if(nums[i]%2 != 0){
                ans[last] = nums[i];
                last--;
            }
        }
        return ans;
    }
}