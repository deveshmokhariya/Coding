class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                list.add(nums[i]);
            }
        }

        list.add(nums[n - 1]);

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}