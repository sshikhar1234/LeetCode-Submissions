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
    List<Integer> lonely = new ArrayList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {
        if(root !=null){
        dfs(root.left,root);
        dfs(root.right,root);            
        }
        return lonely;
    }
    private void dfs(TreeNode root, TreeNode parent){
        if(root!= null){
            if(parent.left ==null || parent.right ==null){
                lonely.add(root.val);
            }
            dfs(root.left,root);
            dfs(root.right,root);
        }return;
    }
}