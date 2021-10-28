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
//         Stack<Character> stack = new Stack<>();
//         int globalSum = 0;
//         boolean madePush = false;
//         int temp  = 0;
//         for(char ch: s.toCharArray()){
//             System.out.println("Temp is "+temp);
//             System.out.println("globalSum is "+globalSum);
//             System.out.println("Stack is "+stack);
//             System.out.println("Ch is "+ch);
//             if(ch == '('){
//                 stack.push(ch);
//                 madePush = false;
//                 temp = 0;
                    
//             }
//             if(ch == ')' ){
//                 if(madePush){
//             System.out.println("In if condition");
//             System.out.println("Temp is: "+temp);
//                     //globalSum = globalSum -  += 1 << bal;
//                     globalSum  += 1 << temp;
//                     stack.pop();
//                     System.out.println("Globalsum now "+globalSum);
//                     continue;
//                 }
//                 stack.pop();
//                 temp++;
//                 globalSum +=temp;
//                 madePush = true;
//             }
//         }
//         return globalSum;
    }
}