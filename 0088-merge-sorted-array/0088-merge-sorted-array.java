// class Solution {
//     public int[] merge(int[] nums1, int m, int[] nums2, int n) {
//         int p = m+n;
//         int temp[] = new int[p];
//         for(int i = 0; i<m; i++){
//             temp[i] = nums1[i];
//         }
//         for(int i = 0; i<n; i++){
//             temp[m+i] = nums2[i];
//         }
//         Arrays.sort(temp);
//         return temp;
//     }
// }
import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
