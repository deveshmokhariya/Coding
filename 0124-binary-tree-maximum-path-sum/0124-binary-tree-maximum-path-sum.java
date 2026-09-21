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
    class Res {
        int val;
    }

    public int maxPathUtil(TreeNode node, Res res) {
        if(node == null) {
            return 0;
        }

        int l = maxPathUtil(node.left, res);
        int r = maxPathUtil(node.right, res);

        int max_single = Math.max(Math.max(l, r) + node.val, node.val);

        int max_top = Math.max(max_single, l + r + node.val);

        res.val = Math.max(res.val, max_top);

        return max_single;
    }

    public int maxPathSum(TreeNode root) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;

        maxPathUtil(root, res);

        return res.val;
    }
}