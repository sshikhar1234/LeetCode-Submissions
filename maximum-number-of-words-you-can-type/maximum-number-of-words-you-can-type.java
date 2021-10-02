class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashMap<Character,Boolean> brokens = new HashMap<Character,Boolean>();
        int count = 0;
        for(char s : brokenLetters.toCharArray()){
            brokens.put(s,true);
        }
        
        for(String s : text.split(" ")){
            for(char chr : s.toCharArray()){
                if(brokens.containsKey(chr)){
                    count--;
                   break; 
                }
            }
            count++;
        }
        return count;
    }
}