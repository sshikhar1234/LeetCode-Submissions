/**
 * @param {number[][]} points
 * @return {number}
 */
var minTimeToVisitAllPoints = function(points) {
    let time = 0
    for(let i = 0;i<points.length-1;i++){
        const p1 = points[i]
        const p2 = points[i+1]
        time = time + Math.max(Math.abs(p1[0]-p2[0]),Math.abs(p1[1]-p2[1]))
    }
    return time
};