/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {
    var hash = new Map()
    var count = words.length
    for(var i = 0;i<allowed.length;i++){
        hash.set(allowed.charAt(i),true)
    }
    for(var i = 0;i<words.length;i++){
        var currentWord = words[i]
        for(var j = 0;j<currentWord.length;j++){
            if(!hash.has(currentWord.charAt(j))){
                count --
                break
            }
        }
    }
    return count
};