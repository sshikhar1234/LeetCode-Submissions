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
    public int closestValue(TreeNode root, double target) {
        int val =0;
        int closest = root.val;
        while(root!=null){
            val = root.val;
            double diff = Math.abs(val-target);
            if(diff<Math.abs(closest -target)){
                closest = val;
            }
            root = target<root.val ? root.left : root.right;
        }
        return closest;
    }
}