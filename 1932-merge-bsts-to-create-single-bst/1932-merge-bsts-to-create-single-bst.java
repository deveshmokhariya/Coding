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
import java.util.*;

class Solution {
    public TreeNode canMerge(List<TreeNode> trees) {
        Map<Integer, TreeNode> rootMap = new HashMap<>();
        Map<Integer, Integer> leafCount = new HashMap<>();

        // 1. Record roots and count occurrences of leaf values
        for (TreeNode tree : trees) {
            rootMap.put(tree.val, tree);
            if (tree.left != null) {
                leafCount.put(tree.left.val, leafCount.getOrDefault(tree.left.val, 0) + 1);
            }
            if (tree.right != null) {
                leafCount.put(tree.right.val, leafCount.getOrDefault(tree.right.val, 0) + 1);
            }
        }

        // Multiple identical leaves cannot exist in a valid BST
        for (int count : leafCount.values()) {
            if (count > 1) return null;
        }

        // 2. Identify the unique global root
        TreeNode globalRoot = null;
        for (TreeNode tree : trees) {
            if (!leafCount.containsKey(tree.val)) {
                if (globalRoot != null) return null; // More than one candidate root
                globalRoot = tree;
            }
        }

        if (globalRoot == null) return null;

        // 3. Merge and validate BST bounds via DFS
        if (!dfs(globalRoot, rootMap, Long.MIN_VALUE, Long.MAX_VALUE)) {
            return null;
        }

        // 4. Ensure all trees were consumed (only the globalRoot remains un-merged from children)
        return rootMap.size() == 1 ? globalRoot : null;
    }

    private boolean dfs(TreeNode node, Map<Integer, TreeNode> rootMap, long minVal, long maxVal) {
        if (node == null) return true;

        if (node.val <= minVal || node.val >= maxVal) {
            return false;
        }

        // If it's a leaf and matches another tree's root, merge it
        if (node.left == null && node.right == null) {
            if (rootMap.containsKey(node.val) && rootMap.get(node.val) != node) {
                TreeNode target = rootMap.remove(node.val);
                node.left = target.left;
                node.right = target.right;
            }
        }

        return dfs(node.left, rootMap, minVal, node.val) &&
               dfs(node.right, rootMap, node.val, maxVal);
    }
}