/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    return BST(nums,target,0,nums.length-1)
};
function BST(nums,target,start,end){
    if(start>end) return start
    var midIndex = Math.floor((start+end)/2)
    if(target == nums[midIndex]){
        return midIndex
    }
    if(target>nums[midIndex]){
        return BST(nums,target,midIndex+1,end)
    }
    if(target<nums[midIndex]){
        return BST(nums,target,start,midIndex-1)
    }
}