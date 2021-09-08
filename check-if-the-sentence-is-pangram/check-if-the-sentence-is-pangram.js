/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {

//     One line solution:
//     return new Set(sentence).size == 26
    
    var charArray = sentence.split('')
    var hash = new Map()
    for(var i = 0;i<charArray.length;i++){
        if(!hash.has(charArray[i])){
        hash.set(charArray[i],'1')                
        }
    }
    if(hash.size != 26){
        return false
    }
    else return true
};
