class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;
//         rev(nums, 0, n-1);
//         rev(nums, 0, k-1);
//         rev(nums, k, n-1);
//     }
//     public void rev(int[] nums, int low, int high){
//         while(low<high){
//             int temp =  nums[low];
//             nums[low] = nums[high];
//             nums[high] = temp;
//             low++;
//             high--;
//         }
//     }
// }