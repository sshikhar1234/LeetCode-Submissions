class Solution {
    String alphabets = "abcdefghijklmnopqrstuvwxyz";
    public String replaceDigits(String s) {
        char[] chrArray = s.toCharArray();
        for(int i = 1;i<chrArray.length;i = i+2){
            char a = shift(chrArray[i-1],Integer.parseInt(String.valueOf(chrArray[i])));
            chrArray[i]  = a;
        }
        return String.valueOf(chrArray);
    }
    public char shift(char a, int i){
        return alphabets.charAt(alphabets.indexOf(a)+i);
    }
}