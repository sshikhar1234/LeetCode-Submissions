class Solution {
    public int sumOfUnique(int[] nums) {
         HashMap <Integer,Integer> set = new HashMap <Integer,Integer>();
        int sum = 0;
        for (int i = 0;i<nums.length;i++){  
            set.put(nums[i],set.getOrDefault(nums[i],0)+1);   
            if(set.get(nums[i]) ==1 ) {
                sum += nums[i];
            }
            if(set.get(nums[i]) == 2){
                sum -= nums[i];                
            }
        }
        return sum;
    }
}