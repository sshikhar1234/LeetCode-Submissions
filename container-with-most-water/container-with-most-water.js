/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(heights) {
    var p1 = 0
    var p2 = heights.length-1
    var maxArea = 0
    while(p1 < p2){
        var height = Math.min(heights[p1], heights[p2])     
        var width = p2-p1
        var area = width*height
        console.log(width,"*",height)
        console.log(area)
    if(area>maxArea){
          maxArea = area
      }
    if(heights[p1]<=heights[p2]){
        p1++
    }else{
        p2--
        console.log("p2",p2)
    }
    }
    return maxArea
};

