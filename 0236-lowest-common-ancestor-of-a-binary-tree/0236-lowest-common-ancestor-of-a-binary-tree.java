/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        if(rightLCA == null){
            return leftLCA;
        }
        if(leftLCA == null){
            return rightLCA;
        }
        return root;
    }
}

// class Solution {
//     public static boolean getPath(TreeNode root, TreeNode m, ArrayList<TreeNode> path) {
//         if (root == null) {
//             return false;
//         }
//         path.add(root);
//         if (root == m) {
//             return true;
//         }
//         boolean foundLeft = getPath(root.left, m, path);
//         if (foundLeft) {
//             return true;
//         }
//         boolean foundRight = getPath(root.right, m, path);
//         if (foundRight) {
//             return true;
//         }
//         path.remove(path.size() - 1);
//         return false;
//     }

//     public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         ArrayList<TreeNode> path1 = new ArrayList<>();
//         ArrayList<TreeNode> path2 = new ArrayList<>();
//         getPath(root, p, path1);
//         getPath(root, q, path2);
//         int i = 0;
//         for (; i < path1.size() && i < path2.size(); i++) {
//             if (path1.get(i) != path2.get(i)) {
//                 break;
//             }
//         }
//         TreeNode lca = path1.get(i - 1);
//         return lca;
//     }
// }