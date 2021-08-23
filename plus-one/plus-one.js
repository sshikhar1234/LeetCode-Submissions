/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    var length = digits.length - 1
    var temp = length
    while(temp>=0){
        if(digits[temp]<9){
            console.log(digits[temp])
            digits[temp]++
            return digits
        }
        digits[temp]=0
        if(temp==0){
            digits.unshift(1)
        }
        temp--
    }
    return digits
    //  for (let i = digits.length - 1; i >= 0; i--) {
    //      console.log("i is",i)
    //     if (digits[i] !== 9) {
    //         digits[i]++;
    //         return digits;
    //     }
    //     digits[i] = 0;
    //      console.log("digits: ",digits)
    //     if (i === 0) {
    //         digits.unshift(1);
    //         return digits;
    //     }
    // }
};