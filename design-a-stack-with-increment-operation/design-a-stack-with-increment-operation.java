class CustomStack {
    int maxSize;
    int[] stack;
    int top = 0;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[this.maxSize];
    }
    
    public void push(int x) {
        if(this.top < this.maxSize){
            this.stack[top] = x;
            this.top++;
        }
    }
    
    public int pop() {
        if(this.top == 0) return -1;
        top--;
        int val = this.stack[top];
        return val;
    }
    
    public void increment(int k, int val) {
        if(this.top<k){
            for(int i = 0;i<this.top;i++){
                stack[i]  += val;
            }
        }
        else{
            for(int i = 0;i<k;i++){
                stack[i]  += val;
            }
            
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */