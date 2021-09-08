/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    var hashTable = new Map();
    for(var i =0;i<nums.length;i++){
        if(hashTable.has(nums[i])){
            return true
        }
        else{
            hashTable.set(nums[i],true)
        }
    }
    return false
};