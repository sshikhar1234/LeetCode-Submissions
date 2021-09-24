class Solution {
    public boolean areOccurrencesEqual(String s) {
       HashMap<Character,Integer> dict = new HashMap<Character,Integer>();
        for(char chr : s.toCharArray()){
            if(!(dict.containsKey(chr))){
                dict.put(chr,1);
            }else{
                int temp = dict.get(chr);
                temp++;
                dict.put(chr,temp);
            }
        }
    int value = dict.get(s.charAt(0));
    for(char c: dict.keySet())
    {
        if(dict.get(c)!=value)
            return false;
    }return true;
    }
}