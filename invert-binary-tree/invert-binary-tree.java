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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
       dfs(root);
        return root;
    }
    private void dfs(TreeNode node){
        if(node!=null){
            if(node.left !=null && node.right !=null){
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            dfs(node.left);
            dfs(node.right);

            }else if(node.left !=null && node.right ==null){
                node.right = node.left;
                node.left = null;
            dfs(node.right);
            }else if(node.left ==null && node.right !=null){
                node.left = node.right;
                node.right = null;
            dfs(node.left);
            }
        }
    }
}