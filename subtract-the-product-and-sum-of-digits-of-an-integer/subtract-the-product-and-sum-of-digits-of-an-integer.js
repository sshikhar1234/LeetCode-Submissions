/**
 * @param {number} n
 * @return {number}
 */
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