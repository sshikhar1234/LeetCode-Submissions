class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i = lowLimit;i<=highLimit;i++){
        int sum = 0;
        int val = i;
        while (val != 0) {
            sum = sum + val%10;
            val = val / 10;
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
            count = map.get(sum) > count ? map.get(sum) : count;
       }
        return count;
    }
}
