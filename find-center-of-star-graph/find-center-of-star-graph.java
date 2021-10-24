class Solution {
    public int findCenter(int[][] edges) {
        int center = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] arr: edges){
            if(map.containsKey(arr[0])){
                int temp = map.get(arr[0]);
                temp++;
                map.put(arr[0],temp);
            }else if(map.containsKey(arr[1])){
                int temp = map.get(arr[1]);
                temp++;
                map.put(arr[1],temp);
            }else{
                map.put(arr[0],1);
                map.put(arr[1],1);
                
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value == edges.length){
                center = key;
            }
        }
        return center;
    }
}