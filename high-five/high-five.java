class Solution {
    public int[][] highFive(int[][] items) {
       Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        List<Integer> IDs = new ArrayList<>();
        int totalIDs = 0;
       for(int i = 0;i<items.length;i++){
           int[] currArr = items[i];
               if(!map.containsKey(currArr[0])){
                   List<Integer> list = new ArrayList<>();
                   list.add(items[i][1]);
                   totalIDs++;
                   IDs.add(items[i][0]);
                   map.put(currArr[0],list);
               }
               else{
                   List<Integer> list = map.get(items[i][0]);
                   list.add(items[i][1]);
                   map.put(currArr[0],list);
               }
       }
        int[][] result = new int[totalIDs][2];
               for(int i = 0;i<IDs.size();i++){
                   int sum = 0;
                   List<Integer> list = map.get(IDs.get
(i));
                   Collections.sort(list);
                   for(int j=list.size()-1;j>list.size()-6;j--){
                       sum += list.get(j);
                   }
                       result[i][0]  = IDs.get(i);
                       result[i][1]  = sum/5;
               }
           System.out.println(map);
        Arrays.sort(result,(a,b) -> a[0] - b[0]);
        return result;
    }
}