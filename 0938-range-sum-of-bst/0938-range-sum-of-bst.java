/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val{ this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return SumBST(root, low, high);
    }

    private int SumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;

        if (root.val < low)
            return SumBST(root.right, low, high);

        if (root.val > high)
            return SumBST(root.left, low, high);

        return root.val
             + SumBST(root.left, low, high)
             + SumBST(root.right, low, high);
    }
}