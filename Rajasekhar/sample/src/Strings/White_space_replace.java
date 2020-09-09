/* 12) Java Program to replace the spaces of a string with a specific character */
package Strings;
import java.util.Scanner;

public class White_space_replace{

    public static void main(String[] args) { 
        String str ;
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = obj.nextLine();
        String strNew = str.replaceAll(" ","#"); 
           System.out.println("After removing white spaces with # String is: "+strNew);
           obj.close();
    } 

}