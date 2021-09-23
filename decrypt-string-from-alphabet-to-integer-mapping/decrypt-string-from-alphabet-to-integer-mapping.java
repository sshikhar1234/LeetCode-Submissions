class Solution {
    public String freqAlphabets(String str) {
        HashMap<String,Character> dict = new HashMap<String,Character>();
        int k = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch < 'j')
                dict.put(String.valueOf(k++), ch);
            else
                dict.put(String.valueOf(k++)+"#", ch);
        }
        StringBuilder sb = new StringBuilder();
        int i = str.length() - 1;
        while (i >= 0) {
            if (str.charAt(i) == '#') {
                sb.append(dict.get(str.substring(i - 2, i+1)));
                i -= 3;
            } else {
                sb.append(dict.get(str.substring(i, i + 1)));
                i--;
            }
        }
        
    return sb.reverse().toString();
    }
}