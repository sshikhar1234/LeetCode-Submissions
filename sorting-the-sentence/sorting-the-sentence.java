class Solution {
    public String sortSentence(String s) {
        String res = "";
        String[] splited = s.split("\\s+");
        String[] newStr = new String[splited.length];
        for (String currentStr : splited) {
        char[] chars = currentStr.toCharArray();
            for(char c : chars){
                if(Character.isDigit(c)){
                    int temp = Integer.parseInt(String.valueOf(c));
                    currentStr = currentStr.substring(0, currentStr.length() - 1);
                    res = res+currentStr+" ";
                    newStr[temp-1] = currentStr;
                    }
                }
            }
    return String.join(" ", newStr);
    }
}