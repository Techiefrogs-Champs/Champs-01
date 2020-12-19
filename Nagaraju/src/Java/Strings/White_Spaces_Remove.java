/*10) Java Program to remove all the white spaces from a string */
package Strings;
import java.util.Scanner;

class White_Spaces_Remove {

    public static void main(String[] args) { 
        String str ;
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = obj.nextLine();
        String strNew = str.replaceAll(" ",""); 
           System.out.println("Afterb removing white spaces String is: "+strNew);
           obj.close();
    } 
    
}

