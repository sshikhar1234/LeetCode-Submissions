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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode res = new TreeNode(0);
        TreeNode cur = res;
        List<Integer> vals = new ArrayList();
        inorder(root,vals);
        for(int intr :vals){
            cur.right = new TreeNode(intr);
            cur = cur.right;
        }
        return res.right;
    }
    public void inorder(TreeNode node,List<Integer> vals){
        if(node ==null) return;
        inorder(node.left,vals);
        vals.add(node.val);
        inorder(node.right,vals);
    }
}