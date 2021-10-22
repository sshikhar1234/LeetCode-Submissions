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
    int maxLength = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) return maxLength;
        maxLength= dfs(root);
        return maxLength;
    }
    private int dfs(TreeNode node){
        if(node!=null){
            int left = dfs(node.left);
            int right = dfs(node.right);
           return java.lang.Math.max(left,right) + 1;
        }else return 0;
    }
}