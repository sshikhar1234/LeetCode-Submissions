class Solution {
    public int findCenter(int[][] edges) {
        int x = edges[0][0], y = edges[0][1];
        return (x == edges[1][0] || x ==  edges[1][1]) ? x : y;
    }
}