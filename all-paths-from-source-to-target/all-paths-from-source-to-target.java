class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> paths = new ArrayList<>();
        dfs(graph,res,paths,0);
        return res;
    }
    void dfs(int[][] graph, List<List<Integer>> res, List<Integer> paths, int u){
        paths.add(u);
        if(u == graph.length-1){
          res.add(new ArrayList(paths));  
        }
        else{
        for(int v: graph[u]) {
        dfs(graph,res, paths, v);
        paths.remove(paths.size()-1);
        }
        }
    }
}