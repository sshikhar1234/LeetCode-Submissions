/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function(nums) {
  var res = []
  for(var i = 0;i<nums.length;i++){
      res.push(nums[nums[i]])
  }
    return res
};