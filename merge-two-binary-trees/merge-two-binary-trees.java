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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null){
            return root2;
        }else if(root2 == null){
            return root1;
        }
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{root1,root2});
        while(!stack.isEmpty()){
            TreeNode[] arr = stack.pop();
            if(arr[0] == null || arr[1] == null){
                continue;
            }
            arr[0].val += arr[1].val;
            if(arr[0].left != null){
                stack.push(new TreeNode[]{arr[0].left,arr[1].left});
            }else{
                arr[0].left = arr[1].left;
            }
            if(arr[0].right != null){
                stack.push(new TreeNode[]{arr[0].right,arr[1].right});
            }else{
                arr[0].right = arr[1].right;
            }
        }
        return root1;
    }
}