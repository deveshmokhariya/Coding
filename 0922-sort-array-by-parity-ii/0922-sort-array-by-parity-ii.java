class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ans = 1;
        int results [] = new int[n];
        for(int i =0 ; i<n; i++){
            if(nums[i]%2 == 0){
                results[count] = nums[i];
                count += 2;
            }else{
                results[ans] = nums[i];
                ans += 2;

            }
        }
        return results;
    }
}