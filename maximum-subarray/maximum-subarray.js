/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    var currentMax = 0
    var max = -Infinity
    for(var i = 0;i<nums.length;i++){
       currentMax = Math.max(nums[i],nums[i]+currentMax)
        max = Math.max(currentMax,max)
    }
    return max
};