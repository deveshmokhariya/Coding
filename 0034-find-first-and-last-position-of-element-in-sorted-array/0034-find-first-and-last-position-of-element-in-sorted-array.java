class Solution {
    static int firstOcc(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x > arr[mid]) {
                low = mid + 1;
            } 
            else if (x < arr[mid]) {
                high = mid - 1;
            } 
            else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return -1;
    }

    static int lastOcc(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x > arr[mid]) {
                low = mid + 1;
            } 
            else if (x < arr[mid]) {
                high = mid - 1;
            } 
            else {
                if (mid == n - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        return -1;
    }

    public int[] searchRange(int[] arr, int x) {
        int n = arr.length;
        int first = firstOcc(arr, n, x);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = lastOcc(arr, n, x);
        return new int[]{first, last};
    }
}