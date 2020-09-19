package Strings;

public class Duplicateword {
    public static void main(String[] args) {
        String S="you can not pull you can only push";
        int count;
        S=S.toLowerCase();
        String word []=S.split(" ");
        System.out.println("duplicate words in string are:");
        for(int i=0;i<word.length; i++) {
            count=1;
            for(int j=i+1;j<word.length; j++) {
                if(word[i].equals(word[j])){
                 count++; 
                  //Set words[j] to 0 to avoid printing visited word
                 word[j]="0";  
                }
         
       }
         //Displays the duplicate word if count is greater than 1  

       if(count>1 && word[i]!="0"){
           System.out.println(word[i]);
       }
        }
    }
    
}
