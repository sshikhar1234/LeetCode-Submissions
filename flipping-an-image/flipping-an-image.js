/**
 * @param {number[][]} image
 * @return {number[][]}
 */
var flipAndInvertImage = function(image) {
    let res = []
    for(let row of image){
        let resRow = []
        for(let i = 0, j = row.length-1;i<row.length,j>=0;i++,j--){
            resRow[j] = row[i] 
        }
        res.push(resRow)
    }
    for(let b = 0;b<res.length;b++){
        let currentItem = res[b]
        for(let c = 0;c<currentItem.length;c++){
            if(currentItem[c] == 1){
                currentItem[c] = 0
            }else{
                currentItem[c] = 1
            }
        }
        res[b] = currentItem 
    }
    return res
};