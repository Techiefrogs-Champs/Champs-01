/* 11) Java Program to replace lower-case characters with upper-case and vice-versa */
package Strings;
import java.util.Scanner;

class Uppercase2 {  
    public static void main(String[] args) {    
    String str1;    
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a string: ");
    str1 = obj.nextLine();
    StringBuffer newStr=new StringBuffer(str1);    
    for(int i = 0; i < str1.length(); i++) {    
        if(Character.isLowerCase(str1.charAt(i))) {    
        newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
        }    
        else if(Character.isUpperCase(str1.charAt(i))) {    
        newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
        }    
    }    
    System.out.println("String after case conversion : " + newStr);   
    obj.close(); 
    }    
}     
    
