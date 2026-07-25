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
    int ans = 0;

    public int findBottomLeftValue(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        dfs(root, 0, arr);
        return ans;
    }

    private void dfs(TreeNode root, int depth, List<Integer> arr) {
        if (root == null) return;

        if (arr.size() == depth) {
            ans = root.val;
            arr.add(root.val);  
        }

        dfs(root.left, depth + 1, arr);
        dfs(root.right, depth + 1, arr);
    }
}