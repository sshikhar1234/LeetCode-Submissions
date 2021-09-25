class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> uncommon = new ArrayList<String>();
        HashMap<String,Integer> dict = new HashMap<String,Integer>();
         for(String str: s1.split(" ")){
             if(dict.containsKey(str)){
                 int temp = (dict.get(str));
                 temp++;
                 dict.put(str, temp);
             }
             else{
                 dict.put(str, 1);             
             }
         }   
         for(String str: s2.split(" ")){
             if(dict.containsKey(str)){
                 int temp = (dict.get(str));
                 temp++;
                 dict.put(str, temp);
             }
             else{
                 dict.put(str, 1);             
             }
         }   
         for(Map.Entry<String,Integer> entry: dict.entrySet()){
             if(entry.getValue()<2){
                 uncommon.add(entry.getKey());
             }
         }   
        String[] uncommonArr = new String[uncommon.size()];
        for(int j =0;j<uncommon.size();j++){
          uncommonArr[j] = uncommon.get(j);
        }
        return uncommonArr;
    }
}