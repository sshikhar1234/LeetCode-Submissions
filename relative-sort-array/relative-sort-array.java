class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hashMap  = new HashMap<Integer,Integer>();
        int[] res = new int[arr1.length];

        int last = arr1.length-1;
        for(int i  =0;i<arr2.length;i++){
            hashMap.putIfAbsent(arr2[i],0);
        }
        for(int num : arr1){
            if(hashMap.containsKey(num)){
                hashMap.put(num,hashMap.getOrDefault(num,0)+1);
            }
            else {
                res[last--] = num;
            }
        }
        int p = 0;
        for (int num : arr2) {
            int c = hashMap.get(num);
            for (int i = 0; i < c; i++) {
                res[p++] = num;
            }
        }
        //now sort the leftovers - p points to the first element in series of those from arr2 that are not in arr1 
        Arrays.sort(res,p,res.length);
         return res;
    }
}