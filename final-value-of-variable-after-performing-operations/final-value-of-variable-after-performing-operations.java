class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String s : operations){
            if(s.contains("++"))  x++;
            else if(s.contains("--"))    x--;
        }
        return x;
    }
}