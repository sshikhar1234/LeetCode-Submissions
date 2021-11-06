class SparseVector {
    int[] nums;
    int len;
    SparseVector(int[] nums) {
        this.nums = nums;
        this.len = nums.length;
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int sum = 0;
        int[] secondVec = vec.nums;
        for( int i =0;i<this.len;i++){
            if(nums[i] == 0 || secondVec[i] ==0){
             continue;   
            }else{                
            sum += nums[i] * secondVec[i];
            }
        }
        return sum;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);