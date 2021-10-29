class Solution {
    public int scoreOfParentheses(String s) {
        int depth = 1;
        int sum = 0;
        s=s.replace("()","a");
        for(char ch: s.toCharArray()){
            if(ch == '('){
                depth = depth *2;
            }
            else if(ch == ')'){
                depth = depth /2;
            }
           else if(ch == 'a'){
                sum = sum + depth;
            }
        }
        return sum;

    }
}