class Solution {
    public String addStrings(String num1, String num2) {
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        StringBuilder sb=new StringBuilder("");
        int carry = 0;
        while(p1>=0 || p2>=0){
            int x1 =0;
            int x2 = 0;
            if(p1>=0){
                x1 = num1.charAt(p1) -'0';
            }
            if(p2>=0){
                x2 = num2.charAt(p2)-'0';
            }
             int temp = x1 + x2;
            if(carry == 0){
                if(temp >= 10){
                    temp = (temp)%10;
                    carry = 1;
                    
                }
            }
            else{
               temp = temp + carry;
                if(temp >= 10){
                temp = (temp)%10;
            }else carry = 0;
            }
            sb.append(temp);
            p1--;
            p2--;
        }
        if(carry != 0){
            sb.append(carry);
        }
return sb.reverse().toString();
    }
}