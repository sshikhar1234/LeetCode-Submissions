class Solution {
    public int balancedStringSplit(String s) {
        char[]  array = s.toCharArray();
        int balance =0;
        int count =0;
        int i = 0;
        while(i<array.length){
            if(array[i] =='R'){
                balance ++;
            }else{
                balance --;
            }
            if(balance == 0){
               count ++; 
            }
            i++;
        }
    return count;        
    }
}