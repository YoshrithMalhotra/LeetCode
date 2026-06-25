/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null & p == null) return true;
        if(q == null || p == null || q.val != p.val) return false;
        return(isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}