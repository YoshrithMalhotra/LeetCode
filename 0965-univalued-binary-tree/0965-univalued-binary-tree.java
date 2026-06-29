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
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        return UnivalTree(root, root.val);
    }

    private boolean UnivalTree(TreeNode root, int x) {
        if (root == null) return true;

        if (root.val != x) return false;

        return UnivalTree(root.left, x) &&
               UnivalTree(root.right, x);
    }
}