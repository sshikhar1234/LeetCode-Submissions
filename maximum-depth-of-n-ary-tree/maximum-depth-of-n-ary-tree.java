/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int maxLength = 0;
    public int maxDepth(Node root) {
        if(root == null) return maxLength;
       maxLength =  dfs(root);
        return maxLength;
    }
    private int dfs(Node node){
        if(node!=null){
            if(node.children.isEmpty()){
                return 1;
            }
            List<Integer> heights = new LinkedList<>();
            for(Node child : node.children){
            heights.add(dfs(child));
            }
        return Collections.max(heights) + 1;
        }
        return 0;
    }
}