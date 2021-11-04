class Solution {
    public String reverseParentheses(String s) {
       // Deque<StringBuilder> stack = new ArrayDeque<>();
        //  stack.push(new StringBuilder());                            for(int i = 0;i<s.length();i++){
        //     if(s.charAt(i) == '('){
        //     stack.push(new StringBuilder());                            
        //     }else if(s.charAt(i) == ')'){
        //         StringBuilder deeper = stack.pop().reverse();
        //         stack.peek().append(deeper);
        //     }else{
        //         stack.peek().append(s.charAt(i));
        //     }
        // }
        // return stack.pop().toString();
        Stack<Character> stack = new Stack();
        for(int i = 0;i<s.length();i++){       
            if(s.charAt(i) ==')'){
                StringBuilder sb = new StringBuilder();
                 while(stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
                for(int j = 0;j<sb.length();j++){                  
                    stack.push(sb.charAt(j));
                }
            }else stack.push(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}