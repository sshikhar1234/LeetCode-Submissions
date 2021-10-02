class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
          int[] countArray = new int[1001];
		
        for(int i= 0; i< target.length; i++){
            countArray[target[i]]++;
        }
		
        for(int i=0; i<arr.length; i++){
            if(countArray[arr[i]] != 0){
                countArray[arr[i]]--;
            }else{
                return false;
            }
        } 
        return true;
    }
}