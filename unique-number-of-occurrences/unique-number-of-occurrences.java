class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
        Set<Integer> sett = new HashSet<Integer>();
        for(int i =0;i<arr.length;i++){
            dict.put(arr[i],dict.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: dict.entrySet()){
            sett.add(entry.getValue());
        }
        return sett.size() == dict.size() ? true : false;
    }
}