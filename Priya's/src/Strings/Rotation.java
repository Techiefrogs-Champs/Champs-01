package Strings;
import java.util.Scanner;

class Rotation {
        public static void main(String args[]){
           String str1 ;
           String str2 ;
           Scanner obj =new Scanner(System.in);
           System.out.print("Enter a string: ");
           str1 = obj.nextLine();
           System.out.print("Enter another string: ");
           str2 = obj.nextLine();
           String s3 = str1+str1;
           if(s3.contains(str2)) {
              System.out.println(str1 + ":  is rotation of: "+ str2);
           } else {
              System.out.println(str1+ ":  is not rotation of: "+str2);
           }
           obj.close();
        }
    
}