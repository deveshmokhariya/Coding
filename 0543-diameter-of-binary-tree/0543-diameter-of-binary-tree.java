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
// class Solution {
//     public int height(TreeNode root){
//         if(root == null){
//             return 0;
//         }
//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh)+1;
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
//         int leftDiam = diameterOfBinaryTree(root.left); 
//         int leftht = height(root.left); 
//         int rightDiam = diameterOfBinaryTree(root.right); 
//         int rightht = height(root.right); 
//         int selfDiam = leftht + rightht;
        
//         return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
//     }
// }

class Solution {

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Info result = diameter(root);
        return result.diam;
    }

    public Info diameter(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(
            Math.max(leftInfo.diam, rightInfo.diam),
            leftInfo.ht + rightInfo.ht
        );

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }
}