class Solution {
    public int removePalindromeSub(String s) {
        //3 ANSWERS POSSIBLE
        //0: IF STRING EMPTY
        //1: IF STRING PALINDROME
        //2: IF STRING NOT PALINDROME
        if(s.isEmpty()){
            return 0;
        }else if(isPalindrome(s)){
            return 1;
        }
     return 2;
    }
    public boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}