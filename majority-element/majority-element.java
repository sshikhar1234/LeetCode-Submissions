class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int tem = map.get(nums[i]);
                tem++;
                map.put(nums[i],tem);
            }
            else{
            map.put(nums[i],1);                
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() >(nums.length/2)){
                return entry.getKey();
            }
        }
        System.out.println(map);
        return 0;
    }
}