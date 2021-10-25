class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        int[] inDegrees = new int[n];
        System.out.println(edges);
        for(List<Integer> edge: edges){            
        // System.out.println(edges.get(i));
            inDegrees[edge.get(1)]++;
        }
        for(int i = 0;i<n;i++){            
        System.out.println("i is "+i);
        System.out.println("In degree: "+inDegrees[i]);              
        }
        for(int i = 0;i<n;i++){            
            if(inDegrees[i] == 0){
                res.add(i);
            }
        }
        return res;
    }
}