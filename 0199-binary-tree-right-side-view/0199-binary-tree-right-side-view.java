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

    static class Info {
        TreeNode node;
        int vd;

        public Info(TreeNode node, int vd) {
            this.node = node;
            this.vd = vd;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, TreeNode> map = new HashMap<>();

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {

            Info curr = q.remove();

            map.put(curr.vd, curr.node);

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.vd + 1));
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.vd + 1));
            }
        }

        for (int i = 0; i <= map.size() - 1; i++) {
            ans.add(map.get(i).val);
        }

        return ans;
    }
}