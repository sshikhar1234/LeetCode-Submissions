/**
 * @param {number[]} nums
 * @return {number[]}
 */
var decompressRLElist = function(nums) {
    let res = []
    for(let i = 0; i<nums.length; i+=2){
         let arrLen = nums[i]
         while(arrLen>0){
             res.push(nums[i+1])
             arrLen--
         }
 }   
    return res
};