/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let min = Number.MAX_VALUE
    let max = 0
   for(let i = 0;i<prices.length;i++){
       if(prices[i]<min){
           min = prices[i]
       }else if (prices[i] - min >max){
           max = prices[i] - min
       }
       // for(let j = i+1;j<prices.length;j++){
       //     if(prices[j]-prices[i] > max){
       //         max = prices[j]-prices[i]
       //     }
       // }
   }
    return max
   
};