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

    TreeNode prev;
    TreeNode dummy;

    public TreeNode increasingBST(TreeNode root) {
        dummy = new TreeNode(-1);
        prev = dummy;

        inorder(root);

        return dummy.right;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        root.left = null;
        prev.right = root;
        prev = root;

        inorder(root.right);
    }
}