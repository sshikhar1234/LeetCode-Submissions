/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
//Brute Force:
var restoreString = function(s, indices) {
    let res = new Array(indices.length)
    for(let i = 0;i<indices.length;i++){
        
        res[indices[i]] =(s[i])
    }
    return res.join('');
};

// Optimal Approach:
// var restoreString = function(s, indices) {
//     let res = new Array(indices.length)
//     for(let i = 0;i<indices.length;i++){
//         res[indices[i]] = s[i]
//     }
//     return res.join('');
// };

