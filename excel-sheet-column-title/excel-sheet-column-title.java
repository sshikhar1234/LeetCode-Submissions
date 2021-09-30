class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char addChar = (char)(columnNumber%26 +65);
            sb.insert(0,addChar);
            columnNumber /=26;
        }
        return sb.toString();
    }
}