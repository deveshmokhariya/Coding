class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        long sum = 0;
        long maxImprovement = 0;
        int[] copy = nums1.clone();
        Arrays.sort(copy);

        for(int i = 0; i < n; i++){
            sum += Math.abs((long) nums1[i] - nums2[i]);
        }

        for(int i = 0; i < n; i++){
            long currDiff = Math.abs((long) nums1[i] - nums2[i]);
            int closeNum = binarySearch(copy, nums2[i]);
            long newDiff = Math.abs((long) nums2[i] - closeNum);

            long improvement = currDiff - newDiff;
            
            maxImprovement = Math.max(maxImprovement, improvement);
        }

        return (int) ((sum - maxImprovement) % 1_000_000_007);
    }

    private int binarySearch(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr[mid] < num){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        if(left == 0){
            return arr[left];
        }

        long diff1 = Math.abs((long) num - arr[left]);
        long diff2 = Math.abs((long) num - arr[left - 1]);

        if(diff1 < diff2){
            return arr[left];
        }
        else {
            return arr[left - 1];
        }
    }
}