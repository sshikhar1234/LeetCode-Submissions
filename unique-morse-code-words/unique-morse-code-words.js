/**
 * @param {string[]} words
 * @return {number}
 */
var uniqueMorseRepresentations = function(words) {
//     Brute Force: 
//-----------------
    
//     const morseCode = { a :".-", 
//                      b: "-...", 
//                      c: "-.-.", 
//                      d: "-..", 
//                      e: ".", 
//                      f: "..-.", 
//                      g: "--.", 
//                      h: "....", 
//                      i: "..",  
//                      j: ".---", 
//                      k: "-.-", l: ".-..", m: "--", n: "-.", o: "---", p: ".--.", q: "--.-", r: ".-.", s: "...", t: "-", u: "..-", v: "...-", w: ".--", x: "-..-", y: "-.--", z: "--.."}
    
//     let data = new Set();
//     for(let p1 = 0;p1<words.length;p1++){
//         let tempStr = ""
//         for(let p2 = 0;p2<words[p1].length;p2++){
//             let c = words[p1]
//             tempStr +=  morseCode[c.charAt(p2)]
//         }
//         data.add(tempStr)            
//     }
//     return data.size

    
//   Better version 1: 
//--------------------
    
//     const morseCode = { a :".-", 
//                      b: "-...", 
//                      c: "-.-.", 
//                      d: "-..", 
//                      e: ".", 
//                      f: "..-.", 
//                      g: "--.", 
//                      h: "....", 
//                      i: "..",  
//                      j: ".---", 
//                      k: "-.-", l: ".-..", m: "--", n: "-.", o: "---", p: ".--.", q: "--.-", r: ".-.", s: "...", t: "-", u: "..-", v: "...-", w: ".--", x: "-..-", y: "-.--", z: "--.."}
    
//     let data = new Set();
//     for(let p1 = 0;p1<words.length;p1++){
//         let tempStr = ""
//         let subArray = words[p1].filter(function(chr) {
//             return morseCode[chr]
//         })
//         subArray.join('')
//         data.add(subArray)
//     }
//   return data.size
    
    
//   Better version 2: 
//--------------------

//     const morseCode = { a :".-", 
//                      b: "-...", 
//                      c: "-.-.", 
//                      d: "-..", 
//                      e: ".", 
//                      f: "..-.", 
//                      g: "--.", 
//                      h: "....", 
//                      i: "..",  
//                      j: ".---", 
//                      k: "-.-", l: ".-..", m: "--", n: "-.", o: "---", p: ".--.", q: "--.-", r: ".-.", s: "...", t: "-", u: "..-", v: "...-", w: ".--", x: "-..-", y: "-.--", z: "--.."}
    
//     let data = new Set();
//     for(let p1 = 0;p1<words.length;p1++){
//         data.add(words[p1].filter(chr => morseCode[chr]).join(''))
//     }
//   return data.size    
    
//   Better version 3: 
//--------------------

    const morseCode = { a :".-", 
                     b: "-...", 
                     c: "-.-.", 
                     d: "-..", 
                     e: ".", 
                     f: "..-.", 
                     g: "--.", 
                     h: "....", 
                     i: "..",  
                     j: ".---", 
                     k: "-.-", l: ".-..", m: "--", n: "-.", o: "---", p: ".--.", q: "--.-", r: ".-.", s: "...", t: "-", u: "..-", v: "...-", w: ".--", x: "-..-", y: "-.--", z: "--.."}
    
    let data = new Set();
    
    for(let p1 = 0;p1<words.length;p1++){
        data.add(words[p1].filter(chr => morseCode[chr]).join(''))
    }
  return data.size    

};

