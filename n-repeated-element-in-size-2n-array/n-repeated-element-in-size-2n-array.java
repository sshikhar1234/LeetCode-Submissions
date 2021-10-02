class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> dict = new HashMap<Integer,Integer>();
        for(int num : nums){
            if(!dict.containsKey(num)){
            dict.put(num,1);                
            }
            else{
                dict.put(num,dict.getOrDefault(num,0)+1);
            }
            for(Map.Entry<Integer,Integer> entry: dict.entrySet()){
                if(entry.getValue() >1){
                    return entry.getKey();
                }
            }
        }
        return 0;
    }
}