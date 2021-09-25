class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        int sbLength = 0;
        for(char c : s.toCharArray()){   
            if(sbLength == 0){
                stack.append(c);
                sbLength++;
            }
            else{
                if(stack.charAt(sbLength - 1) == c){
                    stack.deleteCharAt(sbLength - 1);
                    sbLength--;
                }else{
                    stack.append(c);
                    sbLength++;
                }
            }
        }
    return stack.toString();
    }
}