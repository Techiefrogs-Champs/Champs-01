/* input: Techie Frogs
   output: tECHIEfROGS */

import java.util.Scanner;

public class Swapcase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("please enter the string: ");
        String str = obj.nextLine();
        String str1 = str.replaceAll("\\s", "");
        
        char x[] = str1.toCharArray();
        //String newstr;
        System.out.println("after removing spaces : "+str1);
     /* StringBuffer newstr= new StringBuffer(str1);
       for(int i=0; i<str1.length();i++){
            if(Character.isLowerCase(str1.charAt(i))){
                newstr.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
            }
            else  if(Character.isUpperCase(str1.charAt(i))) {
                newstr.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("String after swapcase and removing spaces: "+newstr);
        obj.close();
         */
       int i=0;
     while( i!=x.length){
            if (Character.isUpperCase(x[i])){
            x[i] = (char)(x[i]+32);                 //Character.toLowerCase(x[i]);
            }else if(Character.isLowerCase(x[i])){
            x[i] = (char)(x[i]-32);                 //Character.toUpperCase(x[i]);
            }
            System.out.print(x[i]);
            i++;
        } 
        
      
        


    }
    
}