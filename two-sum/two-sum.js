/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

var twoSum = function(nums, target) {
 
 //Optimal solution   
//     for(var i = 0; i<nums.length;i++){
//         var targetPt = target - nums[i]
//         if(hash.has(targetPt)){
//         var j = hash.get(targetPt)
//         if(i!=j){
//             return [i,j]            
//         }
//         }else {
//             hash.set(nums[i],i)
//         }
//     }
//     return null
    
    var hash = new Map();
    
    for(var i = 0; i<nums.length;i++){
        hash.set(nums[i],i)
    }
    for(var i = 0; i<nums.length;i++){
        var targetPt = target - nums[i]
        if(hash.has(targetPt)){
        var j = hash.get(targetPt)
        if(i!=j){
            var arr = new Array();
            arr.push(i)
            arr.push(j)
            return arr            
        }
        }
    }
    return null
    
}
