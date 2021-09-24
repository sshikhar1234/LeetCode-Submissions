class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> dict = new HashSet<String>();
        for(int i =0;i<paths.size();i++){
             List<String> currentList = paths.get(i);
                dict.add(currentList.get(1));
        }
        for(int i =0;i<paths.size();i++){
             List<String> currentList = paths.get(i);
            if(dict.contains(currentList.get(0))){
                dict.remove(currentList.get(0));
            }
        }        
        return dict.iterator().next();
    //     HashMap<String, Integer> dict = new HashMap<String, Integer>();
    //     for(int i =0;i<paths.size();i++){
    //         List<String> currentList = paths.get(i);
    //      for(int j=0;j<currentList.size();j++){             
    //         if(!(dict.containsKey(currentList.get(j)))){
    //             dict.put(currentList.get(j),1);
    //         }
    //          else{
    //              int temp = dict.get(currentList.get(j));
    //              temp++;
    //              dict.put(currentList.get(j),temp);
    //          }
    //      }
    //     }
    //     System.out.println(dict);
    //     for (String key : dict.keySet()) {
    //         int temp = dict.get(key);
    //         if(temp<1){
    //             return key;
    //         }
    //     }
     }
}