class Solution {
    public String reverseParentheses(String s) {
        Deque<StringBuilder> stack = new ArrayDeque<>();
        // Stack<StringBuilder> stack = new Stack();
         stack.push(new StringBuilder());                            for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
            stack.push(new StringBuilder());                            
            }else if(s.charAt(i) == ')'){
                StringBuilder deeper = stack.pop().reverse();
                stack.peek().append(deeper);
            }else{
                stack.peek().append(s.charAt(i));
            }
        }
        return stack.pop().toString();
    }
}