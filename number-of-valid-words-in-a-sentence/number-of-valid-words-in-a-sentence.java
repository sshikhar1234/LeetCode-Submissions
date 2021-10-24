class Solution {
    public int countValidWords(String sentence) {
        int count = 0;
        String[] list = sentence.split(" ");
        for(int i = 0;i<list.length;i++){
            String currentStr = list[i];
            System.out.println(currentStr);
              if(currentStr.equals("")){
                continue;
            }
            if(currentStr == "!"){
                count++;
                continue;
            }
            int hyphens = 0;
            boolean isValid = true;
            for(int j = 0;j<currentStr.length();j++){
                char currentChr = currentStr.charAt(j);
                if(Character.isDigit(currentChr)){
                    //discard current string
                    isValid = false;
            System.out.println(
"Digit found, jumping to next string");
                    break;
                }else if(currentChr == ',' ||currentChr == '!' ||currentChr == '.'){
                    if(j < currentStr.length() - 1){
                        isValid = false;
                        break;
                    }   
                }
                else if(currentChr == '-'){
                    hyphens++;
                    if(hyphens >1){
                        isValid = false;
                        break;
                    }
                    if(j == 0 || j == currentStr.length() - 1){
                        isValid = false;
                        break;
                        
                    }
                    if(!Character.isLetter(currentStr.charAt(j-1))
                          || !Character.isLetter(currentStr.charAt(j+1))){
                        isValid = false;
                        break;
                    }
                }
               
                }
                    if(isValid){
                                    System.out.println(
"Incrementing");

                    count++;            }
        }
                return count;
    }
}//     }
