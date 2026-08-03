class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            s.add(nums2[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (s.contains(nums1[i])) {
                list.add(nums1[i]);
                s.remove(nums1[i]); 
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}