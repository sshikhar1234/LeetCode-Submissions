class Solution {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character,Integer> dict =  new HashMap<Character,Integer>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        for(int i =0;i<=s.length()-1;i++){
            int curr = dict.get(s.charAt(i));
            int next = 0;
            if(i+1<s.length()){
            next = dict.get(s.charAt(i+1));                
            }
            if(curr<next){
                res += (next - curr);
                i++;
            }else{
                res += curr;
            }
            // if(chr == 'I' &&((s.charAt(i+1) == 'V' ) || s.charAt(i+1) == 'X' )){
            // res = res - dict.get(chr);
            //     }
            // else if(chr == 'X' && i<s.length()){
            //     if((s.charAt(i+1) == 'L' ) || s.charAt(i+1) == 'C' ){
            // res = res - dict.get(chr);
            //     }
            //        else{
            // res = res + dict.get(chr);           
            //        }}
            // else if(chr == 'C' &&((s.charAt(i+1) == 'D' ) || s.charAt(i+1) == 'M' )){
            // res = res - dict.get(chr);
            //     }
            // else{
            // res = res + dict.get(chr);                
            // }
            // else if
        }
    return res;
    }
}