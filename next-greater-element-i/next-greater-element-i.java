class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i = 0;i<res.length;i++){
            res[i] = -1;
        }
        boolean matchFound = false;
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(matchFound && j<nums2.length){
                    if(nums2[j] < nums1[i]){
                        continue;
                    }else
                    if(nums2[j] == nums1[i]){
                        continue;                        
                    }else
                    if(nums2[j] > nums1[i]){
                        res[i] = nums2[j];
                        break;
                    }                   
                }
                if(nums1[i] == nums2[j] && j<nums2.length){
                    matchFound = true;
                    continue;
                }
            }
            matchFound = false;
        }

        return res;
    }
}