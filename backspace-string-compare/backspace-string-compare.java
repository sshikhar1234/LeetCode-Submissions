class Solution {
    public boolean backspaceCompare(String s, String t) {
        //1. Initialize two stacks
        //2. Push each char in sta
        //3. If the char is # then do Pop()
        //4. Do the same for both stacks
        //5. Compare two stacks and return val
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '#'){
               if(stack1.isEmpty()){continue;}
                stack1.pop();
                continue;
            }
            stack1.push(c);
        }

        System.out.println(stack1);
        for(char c: t.toCharArray()){
            if(c == '#'){
               if(stack2.isEmpty()){continue;}
                stack2.pop();
                continue;
            }
            stack2.push(c);
        }
        
        System.out.println(stack2);
        return stack1.equals(stack2);
    }
}