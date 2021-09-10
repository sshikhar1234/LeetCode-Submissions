/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
    
    //Optimal Solution
    //    return [...nums,...nums]

    let ans = []
    for(let i = 0;i<nums.length;i++){
        ans.push(nums[i])
    }
    for(let i = 0;i<nums.length;i++){
        ans.push(nums[i])
    }
    return ans
};
