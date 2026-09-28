/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return createBST(list, 0, list.size() - 1);
    }

    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static TreeNode createBST(ArrayList<Integer> list, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = createBST(list, st, mid - 1);
        root.right = createBST(list, mid + 1, end);
        return root;
    }
}