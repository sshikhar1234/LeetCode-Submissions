/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProductDifference = function(nums) {
    var sorted = nums.sort(
        function(a,b)  { return a - b}
    )
    return ((sorted[sorted.length-1] * sorted[sorted.length-2]) - (sorted[0] * sorted[1]))
    };