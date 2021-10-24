class Solution {
      Map<Integer,ArrayList<Integer>> list;
    boolean[] visited;
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if(edges.length == 0){
            return true;
        }
        list = new HashMap<>(n);
        visited = new boolean[n];
        for(int i = 0;i<n;i++){
            list.put(i,new ArrayList<>());
        }
        
        for(int i = 0;i<edges.length;i++){
            int[] edge = edges[i];
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        // System.out.println(list);       
        dfs(visited,start,end);
        return  found;
    }
    private void dfs(boolean[] visited, int start, int end){
         visited[start] = true;
         // System.out.println("current list is"+list.get(start));
        for(int i: list.get(start)) {
         // System.out.println("i is: "+i);
         // System.out.println("visited of i is: "+visited[i]);
            if(i == end){
            // System.out.println("i == end");
            found = true;
            }else if(!visited[i]){
                dfs(visited,i,end);
            }
         
        }
    }
}