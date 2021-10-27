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
    List<Integer> arr = new ArrayList<>();
    HashSet<Integer> complements = new HashSet<>();
    int target = 0;
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        this.target = target;
        inOrder(root1,arr);
        System.out.println(arr);
      return  checkComplement(root2,complements);
        
    }
    private List<Integer> inOrder(TreeNode root, List<Integer> arr){
        if(root == null) return null;
        inOrder(root.left,arr);
        arr.add(root.val);
        complements.add(target - root.val);
        inOrder(root.right,arr);
        return arr;
    }
    private boolean checkComplement(TreeNode root, HashSet<Integer> set)
    {
        if(root == null) return false;
        return checkComplement(root.left, set) || set.contains(root.val) || checkComplement(root.right, set);
    }
}