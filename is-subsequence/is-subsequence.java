class Solution {
    public boolean isSubsequence(String s, String t) {
          int p1 = 0;
        int p2 = 0;
        if(s.length() == 0 ){
        return true;
        }
        char lastFoundChar = 'a';
        while(p1< s.length() && p2<t.length()){
            if((t.charAt(p2) == s.charAt(p1))){
                p1++;
            }
            p2++;
        }
        if(p1 == s.length()){
            return true;
        }else return false;
    }
          
}