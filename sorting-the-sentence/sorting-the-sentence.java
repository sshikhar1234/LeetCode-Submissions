class Solution {
    public String sortSentence(String s) {
        String res = "";
        String[] splited = s.split(" ");
        String[] newStr = new String[splited.length];
        StringBuilder sb = new StringBuilder();
        for (String currentStr : splited) {
        char[] chars = currentStr.toCharArray();
            // int temp = (int) currentStr.charAt(currentStr.length -1)
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