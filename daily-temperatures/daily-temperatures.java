class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int p1 = 0;
        int p2 = 0;
        int[] res  = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            if(i == temperatures.length - 1) res[i] =0;
            else{
                    int ctr = 1;
                for(int j = i+1;j<temperatures.length;j++){
                p1 = temperatures[i];
                p2 = temperatures[j];
                if(p1 < p2){
                    res[i] += ctr;
                    break;
                }else{
                    ctr++;
                    continue;
                }        
                }
            }
            
        }
        return res;
    }
}