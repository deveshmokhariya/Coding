class Solution {
    public int pivotIndex(int[] arr) {
       
    
        int n = arr.length;

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;   // 0-based index
            }

            leftSum += arr[i];
        }

        return -1;
    }
}
    
