class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (nums2[j] == nums1[i]) {
                    break;
                }
            }
            int k;
            for (k = j + 1; k < m; k++) {
                if (nums2[k] > nums1[i]) {
                    ans[i] = nums2[k];
                    break;
                }
            }
            if (k == m) {
                ans[i] = -1;
            }
        }
        return ans;
    }
}