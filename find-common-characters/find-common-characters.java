class Solution {
    public List<String> commonChars(String[] words) {
        
        int[] min = new int[26];
        Arrays.fill(min,Integer.MAX_VALUE);
        List<String> res = new ArrayList<String>();
        for(String s : words){
        int[] frequencies = new int[26];
            for(char chr : s.toCharArray()){
                frequencies[chr - 'a']++;
            }
            System.out.println("Temp array: Start");
            for(int in : frequencies){
            System.out.println(in);
            }
            System.out.println("Temp array: End");
            for(int i =0;i<26;i++){
                min[i] = Math.min(min[i],frequencies[i]);
            }
        }
        for(int i=0;i<26;i++){   
            System.out.println("min[i] = "+min[i]);                
            for(int j = 0;j<min[i];j++){
            res.add(String.valueOf((char)(i +'a')));                
            }
        }
        return res;
    }
}