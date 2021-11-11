class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        int sum = 0;
         Arrays.sort(nums1);
         int[] count = new int[101];
        for(int i =0; i<nums2.length; i++){
            count[nums2[i]]++;
        }
        int j = 0;
         for(int i = 100; i>=1; i--){
             while(count[i] > 0){
                  sum += i*nums1[j];
                 j++;
                count[i]--;
             }
         }
        return sum;
    }
}