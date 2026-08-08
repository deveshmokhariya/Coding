class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int x = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == x) {
                x++;
            }
            else if (nums[i] > x) {
                ans.add(x);
                x++;
                i--;  // check the same number again
            }
        }

        while (x <= nums.length) {
            ans.add(x);
            x++;
        }

        return ans;
    }
}