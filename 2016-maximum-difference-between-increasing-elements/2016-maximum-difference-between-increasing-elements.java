class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int ans = -1; 
        for(int i = 0; i<n; i++){
            if(nums[i] > min){
                ans = Math.max(ans, nums[i]-min);
            }
            else{
                min = nums[i];
            }
        }
        return ans;
    }
}
// class Solution {
//     public int maximumDifference(int[] nums) {
//         int n = nums.length;
//         int min = nums[0];
//         int ans = -1;
//         for(int i = 1; i < n ; i++){
//             if(nums[i] > min){
//                 ans = Math.max(ans, nums[i]-min);
//             }
//             else{
//                 min = nums[i];
//             }

//         }
//         return ans;
//     }
// }