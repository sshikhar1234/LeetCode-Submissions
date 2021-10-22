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
    List<Integer> values = new ArrayList<>();
    public boolean isUnivalTree(TreeNode root) {
        dfs(root);
        for(int i : values){
            if(i != values.get(0)){
                return false;
            }
        }
        return true;
    }
    private void dfs(TreeNode node){
        if(node != null){
            values.add(node.val);            
            dfs(node.left);
            dfs(node.right);
        }
    }
}