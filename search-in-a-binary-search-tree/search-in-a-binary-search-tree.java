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
    TreeNode res;
    public TreeNode searchBST(TreeNode root, int val) {
        dfs(root,val);
        return res;
    }
    private void dfs(TreeNode root, int val){
        if(root == null) return;
            if(val > root.val){
                dfs(root.right,val);
            }
        if(val<root.val){
            dfs(root.left,val);
        }else if(val == root.val){
            res = root;
        }
            // if(root.val == val){
            //     res = root;
            // }else{
            //     dfs(root.left,val);
            //     dfs(root.right,val);
            // }
    }
}