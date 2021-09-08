/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var anagramMappings = function(nums1, nums2) {
    var hasMap = new Map();
    var res = []
    for(var i = 0;i<nums2.length;i++){
        if(!hasMap.has(nums2[i])){
            hasMap.set(nums2[i],i)
        }
    }
    for(var i = 0;i<nums1.length;i++){
        if(hasMap.has(nums1[i])){
            res.push(hasMap.get(nums1[i])) 
        }
    }
    return res
};