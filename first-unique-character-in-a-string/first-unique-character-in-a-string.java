class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
        int lastIndex = 0;
        for(int i =0;i<s.length();i++){
            char current = s.charAt(i);
                 dict.put(current, dict.getOrDefault(current, 0) + 1);
        }
         for (int i = 0; i < s.length(); i++) {
            System.out.println("currentInd: "+i);
            System.out.println("val: "+dict.get(s.charAt(i)));
            if (dict.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}