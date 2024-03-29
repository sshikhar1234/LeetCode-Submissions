class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
    private int getNext(int n ){
        int sum = 0;
        while(n>0){
            int temp = n % 10;
            sum += temp*temp;
            n = n/10;
        }
        return sum;
    }
}