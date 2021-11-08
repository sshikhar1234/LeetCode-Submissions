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
       int closest = root.val;
        int tempVal = 0;
        while(root!= null){
            tempVal = root.val;
            double diff = Math.abs(tempVal - target);
             if(diff<Math.abs(closest -target)){
                closest = tempVal;
            }
            root = root.val>target ? root.left : root.right;
        }
        return closest;
    }
}