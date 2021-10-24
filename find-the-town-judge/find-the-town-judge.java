class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n+1];
        int[] outDegrees = new int[n+1];
       for(int[] edge : trust){
           outDegrees[edge[0]]++;
           inDegrees[edge[1]]++;
        }
       for(int i = 1;i<=n;i++){
           if(outDegrees[i] ==0 && inDegrees[i] ==n-1){
               return i;
           }
        }
        return -1;
    }
}