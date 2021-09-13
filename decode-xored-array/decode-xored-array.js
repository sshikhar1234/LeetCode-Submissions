/**
 * @param {number[]} encoded
 * @param {number} first
 * @return {number[]}
 */
var decode = function(encoded, first) {
    let res = []
    let p1 = 0
    res.push(first)
    while(p1<encoded.length){
        res[p1 + 1] = encoded[p1] ^ res[p1]
         p1++
    }
    return res
};