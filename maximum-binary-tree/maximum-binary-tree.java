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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       //  int leftStart = 0;
       //  int leftEnd = 0;
       //  int rightStart = 0;
       //  int rightEnd = nums.length - 1;
       // for(int i= 0;i<nums.length-1;i++){
       //     if(nums[i]>nums[i+1]){
       //         root.val =  nums[i];
       //         leftEnd = i - 1;
       //         rightStart = i + 1;
       //     }
       // }
       return createTree(nums, 0, nums.length);
            }
    
    public TreeNode createTree(int[] nums, int ind, int endInd){
        System.out.println("Create Tree Call...");
        System.out.println("start ind "+ind);
        System.out.println("end ind "+endInd);
        if(ind == endInd){
            return null;
        }
        int maximum = ind;
        for(int i= ind;i<endInd;i++){
            if(nums[maximum] <  nums[i]){
                maximum =  i;
            }
        }
        TreeNode max = new TreeNode();
        max.val = nums[maximum];

        System.out.println("Current Max: "+max.val);
        max.left = createTree(nums,ind,maximum);
        max.right = createTree(nums,maximum + 1,endInd);
        
//             TreeNode node = new TreeNode(nums[ind]);
//             System.out.println("node.val: "+node.val);
//         if(ind <= endInd){
            
//             if(node.val<root.val){
//                 root.left = node;
//                 createTree(nums,ind+1,endInd,node);
//             }
//         else if(node.val>root.val){
//                 root.right = node;
//             }
//         }
        return max;
    }
}