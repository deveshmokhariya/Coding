class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int x = 1;
         for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                x++;
            }
            else if (nums[i] > x) {
                ans.add(x);
                x++;
                i--;  
            }
        }
        while (x <= n) {
            ans.add(x);
            x++;
        }
        return ans;
    }
}