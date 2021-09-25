class Solution {
    public String reformatNumber(String number) {
     number = number.replace(" ","").replace("-","");
        List<String> blocks = new ArrayList<String>();
        String res = "";
        char[] arr = number.toCharArray();
        while(!(number.isBlank())){
            System.out.println(number);        
            if((number.toCharArray()).length >4){
            String temp = number.substring(0,3);
            // String[] splited = number.split(temp,1)   
            number = number.replaceFirst(temp, "");
             System.out.println(temp);
             System.out.println(number);
            blocks.add(temp);
            }
            else if((number.toCharArray()).length == 4){
            String block1 = number.substring(0,2);
            number = number.replaceFirst(block1, "");
            // System.out.println(block1);
            blocks.add(block1);
            String block2 = number.substring(0,2);
            number = number.replaceFirst(block2, "");
            // System.out.println(block2);
            blocks.add(block2);
            }
            else{
            if((number.toCharArray()).length == 3){
            String temp = number.substring(0,3);
            number = number.replaceFirst(temp, "");                
            System.out.println(temp);
            blocks.add(temp);
            }
            else if((number.toCharArray()).length == 2){
             System.out.println("In 2");               
             String temp = number.substring(0,2);
            number = number.replaceFirst(temp, "");               
            System.out.println(number);
            blocks.add(temp);
            }
            }
        }
        return  String.join("-", blocks);
    }
}