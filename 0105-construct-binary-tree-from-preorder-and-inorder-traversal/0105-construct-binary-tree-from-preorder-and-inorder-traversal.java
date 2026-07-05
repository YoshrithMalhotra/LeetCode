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

    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder,
                            int start, int end) {

        if (start > end) return null;

        int rootVal = preorder[index++];
        TreeNode root = new TreeNode(rootVal);

        int inorderIndex = search(inorder, start, end, rootVal);

        root.left = helper(preorder, inorder,
                           start, inorderIndex - 1);

        root.right = helper(preorder, inorder,
                            inorderIndex + 1, end);

        return root;
    }

    private int search(int[] inorder,
                       int start,
                       int end,
                       int target) {

        for (int i = start; i <= end; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }

        return -1;
    }
}