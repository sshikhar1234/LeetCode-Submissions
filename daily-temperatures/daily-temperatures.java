class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       //1. User monotonic decrease stack
       //2. If the stack is empty, push the first item;
       //3. If stack is not empty, check if the temp(top of stack)is < ith temp
       //3.1 if yes, then while stack is not empty, popuplate res[stack.peek()] values
       //4. Return stack
        
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                res[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return res;

    }
}