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
        int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root,low,high);
        return sum;
    }
    private void dfs(TreeNode node, int low, int high){
        if(node!=null){
            
        if(node.val>= low && node.val <= high){
           sum = sum+node.val;            
        }
           if(node.val > low){
        System.out.println("IF condition");
               dfs(node.left,low,high);
           }
            if(node.val < high){
        System.out.println("Else IF condition");
               dfs(node.right,low,high);               
           }
        }
    }
}