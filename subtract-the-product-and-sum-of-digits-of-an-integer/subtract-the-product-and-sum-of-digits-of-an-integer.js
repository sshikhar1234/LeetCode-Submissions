/**
 * @param {number} n
 * @return {number}
 */
//Brute Force:

var subtractProductAndSum = function(n) {
    let sum = 0, prod = 1
    while(n>0){
        let currentDigit = n%10
        sum = sum + currentDigit
        prod = prod * currentDigit
        n = Math.floor(n/10)
    }
    return prod-sum
};

// Optimal Approach:
// var subtractProductAndSum = function(n) {
//     let arr = Array.from(String(n), Number)
//     let sum = arr.reduce((total,number) => total + number)
//     let prod = arr.reduce((total,number) => total * number)
//     return prod-sum
// };
