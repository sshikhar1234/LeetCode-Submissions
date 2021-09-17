class Solution {
    public String toLowerCase(String s) {
        int p1 =0;
        char[] charArray = s.toCharArray();
        for(int i = 0;i<charArray.length;i++)
        {
            if(Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }
}