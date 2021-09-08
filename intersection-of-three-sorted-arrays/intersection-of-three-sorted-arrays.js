/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @param {number[]} arr3
 * @return {number[]}
 */
var arraysIntersection = function(arr1, arr2, arr3) {
    var hashMap = new Map();
    var res = []
    for(var i = 0;i<arr1.length;i++){
        if(!hashMap.has(arr1[i])){
            hashMap.set(arr1[i],1)
        }
    }
    for(var j = 0;j<arr2.length;j++){
        if(!hashMap.has(arr2[j])){
            hashMap.set(arr2[j],1)
        }
        else{
            var currentCount = hashMap.get(arr2[j])
            currentCount = currentCount + 1
            hashMap.set(arr2[j],currentCount)
        }
    }
    for(var j = 0;j<arr3.length;j++){
        if(!hashMap.has(arr3[j])){
            hashMap.set(arr3[j],1)
        }
        else{
            var currentCount = hashMap.get(arr3[j])
            currentCount = currentCount + 1
            hashMap.set(arr3[j],currentCount)
        }
    }
    for (const [key, value] of hashMap.entries()) {
        if(value == 3){
            res.push(key)
        }
    }
    return res
};