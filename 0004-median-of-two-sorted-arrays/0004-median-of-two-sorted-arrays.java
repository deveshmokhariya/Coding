class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans[] = new int[n1 + n2];
        for(int i =0; i<n1; i++){
        ans[i] = nums1[i];
        }
        for(int i =0; i<n2; i++){
        ans[n1 + i] = nums2[i];
        }
        Arrays.sort(ans);
        int n = ans.length;

        int mid = n / 2;
        if(n%2!=0){
            return ans[mid];
        }
        return ((long) ans[mid - 1] + ans[mid]) / 2.0;
    }
}