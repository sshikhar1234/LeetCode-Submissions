class Solution {
    public int countGoodSubstrings(String s) {
        int p1 = 0, p2 = 2;
        int count = 0;
        while(p1<s.length() && p2<s.length()){
            String substr = s.substring(p1,p2+1);
            System.out.println(substr);
            if((substr.charAt(0) != substr.charAt(1) && substr.charAt(0) != substr.charAt(2) && substr.charAt(1) != substr.charAt(2))){
                count++;
            }
               p1++;
               p2++;
        }
               return count;
    }
}