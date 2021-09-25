class Solution {
    public String reformatNumber(String number) {
        number = number.replace(" ","").replace("-","");
        StringBuilder sb = new StringBuilder();
        List<String> blocks = new ArrayList<String>();
        while(!(number.isBlank())){
            if((number.toCharArray()).length >4){
            String temp = number.substring(0,3);
            number = number.replaceFirst(temp, "");
            sb.append(temp);
            if(!(number.isBlank())){                    
            sb.append("-");
            }
            blocks.add(temp);
            }
            else if((number.toCharArray()).length == 4){
            String block1 = number.substring(0,2);
            number = number.replaceFirst(block1, "");
            blocks.add(block1);
            sb.append(block1);
            if(!(number.isBlank())){                    
            sb.append("-");
            }
            String block2 = number.substring(0,2);
            number = number.replaceFirst(block2, "");
            blocks.add(block2);
            sb.append(block2);
            if(!(number.isBlank())){                    
            sb.append("-");
            }
            }
            else{
            if((number.toCharArray()).length == 3){
            String temp = number.substring(0,3);
            number = number.replaceFirst(temp, "");                
            sb.append(temp);
            if(!(number.isBlank())){                    
            sb.append("-");
            }
            }
            else if((number.toCharArray()).length == 2){
             String temp = number.substring(0,2);
            number = number.replaceFirst(temp, "");               
            sb.append(temp);
            if(!(number.isBlank())){                    
            sb.append("-");
            }
            }
            }
        }
        return  sb.toString();
    }
}