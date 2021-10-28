class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res  = new int[temperatures.length];
            for(int i = 0;i<temperatures.length;i++){
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                     res[stack.peek()] = i - stack.pop(); 
                }
                stack.push(i);
            }
        return res;
    }
}