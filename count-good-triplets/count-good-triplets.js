/**
 * @param {number[]} arr
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @return {number}
 */
var countGoodTriplets = function(arr, a, b, c) {
    let count = 0
    for(let i = 0;i<arr.length;i++){
        for(let j = i+1 ;j<arr.length;j++)
            {
            for(let k = j+1 ;k<arr.length;k++)            
                {
                let init = arr[i]
                let mid = arr[j]
                let last = arr[k]  
                if(
                Math.abs(init - mid) <=a &&
                Math.abs(mid - last) <=b &&
                Math.abs(init - last) <=c 
                ){
                    count++}
                }
            }
    }
    return count
};