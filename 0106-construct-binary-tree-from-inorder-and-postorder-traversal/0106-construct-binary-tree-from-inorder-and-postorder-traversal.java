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

    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return helper(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int[] postorder,
                            int st, int end) {

        if (st > end) return null;

        int rval = postorder[postIndex--];
        TreeNode root = new TreeNode(rval);

        int idx = find(inorder, rval);

        root.right = helper(inorder, postorder, idx + 1, end);
        root.left = helper(inorder, postorder, st, idx - 1);

        return root;
    }

    private int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target) return i;
        }
        return -1;
    }
}