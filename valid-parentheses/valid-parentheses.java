class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else{
              switch(ch){
                case ')':
                      if(!(stack.isEmpty()) && ((char)(stack.peek()) == '(')){
                          stack.pop();
                      }else{
                          stack.push(ch);
                      }
                    break;
                case ']':
                      if(!(stack.isEmpty()) && ((char)(stack.peek()) == '[')){
                          stack.pop();
                      }else{
                          stack.push(ch);
                      }
                    break;
                case '}':
                      if(!(stack.isEmpty()) && ((char)(stack.peek()) == '{')){
                          stack.pop();
                      }else{
                          stack.push(ch);
                      }
                    break;
            }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}