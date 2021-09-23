class Solution {
    public boolean halvesAreAlike(String s) {
        HashMap<Character,Boolean> dictionary = new HashMap<Character,Boolean>();
        dictionary.put('a', true);
        dictionary.put('e', true);
        dictionary.put('i', true);
        dictionary.put('o', true);
        dictionary.put('u', true);
        dictionary.put('A', true);
        dictionary.put('E', true);
        dictionary.put('I', true);
        dictionary.put('O', true);
        dictionary.put('U', true);
        String first = s.substring(0,(s.length()/2));
        int firstCtr = 0;
        int secondCtr = 0;
        String second = s.substring((s.length()/2),s.length());
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        for(char c : firstArr){
            if(dictionary.containsKey(c)){
                firstCtr++;
            }
        }
        for(char c : secondArr){
            if(dictionary.containsKey(c)){
                secondCtr++;
}
        }
       if(firstCtr==secondCtr) {
            return true;
        } else return false;
    }
}