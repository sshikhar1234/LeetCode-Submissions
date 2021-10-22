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
    List<String> paths = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        preOrder(root,0);
        return sum;
    }
    private void preOrder(TreeNode root,int currentNum){
      if(root !=null){
        currentNum = (currentNum <<1) | root.val;
          if(root.left == null && root.right == null){
              sum += currentNum;
          }
          preOrder(root.left,currentNum);
          preOrder(root.right,currentNum);
      }
    }
}