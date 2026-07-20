class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(n>m){
            return findMedianSortedArrays(nums2,nums1);
        }
        int size=(n+m);
        int total=(n+m+1)/2;
        int l=0,r=n;
        while(l<=r){
            int takeX=(l+r)/2;
            int takeY=total-takeX;

            int partitionXLeft=takeX==0?Integer.MIN_VALUE:nums1[takeX-1];
            int partitionXRight=takeX==n?Integer.MAX_VALUE:nums1[takeX];

            int partitionYLeft=takeY==0?Integer.MIN_VALUE:nums2[takeY-1];
            int partitionYRight=takeY==m?Integer.MAX_VALUE:nums2[takeY];

            if(partitionXLeft<=partitionYRight && partitionXRight>=partitionYLeft){
                if(size%2==0){
                    int a=Math.max(partitionXLeft,partitionYLeft);
                    int b=Math.min(partitionXRight,partitionYRight);
                    return (a+b)/2.0;
                }
                else{
                    return Math.max(partitionXLeft,partitionYLeft);
                }
            }
            else  if(partitionXLeft>partitionYRight){
                r=takeX-1;
            }
            else{
                l=takeX+1;
            }
        }
        return 0.0;
    }
}