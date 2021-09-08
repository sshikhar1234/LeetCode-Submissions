/**
 * @param {string} keyboard
 * @param {string} word
 * @return {number}
 */
function mod(n, m) {
  return ((n % m) + m) % m;
}
var calculateTime = function(keyboard, word) {
    var charArray = word.split('');
    var hashMap = new Map();
    var sum = 0;
    for(var i= 0;i<keyboard.length;i++){
        hashMap.set(keyboard[i],i)
    }
    sum = hashMap.get(charArray[0])
    console.log(hashMap)
    for(var j = 0;j<charArray.length-1;j++){
        console.log("Next addition: "+ Math.abs((hashMap.get(charArray[j]))-(hashMap.get(charArray[j+1]))))
        sum  = sum + Math.abs((hashMap.get(charArray[j]))-(hashMap.get(charArray[j+1])))
    }
   return sum
};