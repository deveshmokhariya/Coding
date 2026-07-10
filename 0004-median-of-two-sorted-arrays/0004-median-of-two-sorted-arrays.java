class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int merg []= new int[m+n];
        for(int i=0;i<m;i++){
            merg[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            merg[m+j]=nums2[j];
        }

        Arrays.sort(merg);

        int len=m+n;

        if(len%2==1){
            return merg[(len)/2];
        } else{
            return (merg[(len/2)-1]+ merg[len/2])/2.0;
        }

        
    }
}

        

