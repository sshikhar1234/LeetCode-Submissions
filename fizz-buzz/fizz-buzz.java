class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1;i<=n;i++){
        StringBuilder sb = new StringBuilder();
            if((i%3==0) && (i%5==0)){
                sb.append("FizzBuzz");
            }
            else if(i%3 == 0){                
                sb.append("Fizz");
            }
            else if(i%5 == 0){                
                sb.append("Buzz");
            } else{
                sb.append(String.valueOf(i));
            }
            list.add(sb.toString());
        }
        return list;
    }
}