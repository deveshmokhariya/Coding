class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int closest = nums[0]+nums[1]+nums[2];
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n;j++){
                for(int k=j+1;k<n;k++){
                    sum = nums[i]+nums[j]+nums[k];
                    if(sum == target){
                        return sum;
                    }
                    if(Math.abs(sum - target) < Math.abs(closest - target)){
                        closest = sum;
                    }
                }
            }
        }
        return closest;
    }
}