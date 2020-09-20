/* 13) Java Program to determine whether a given string is palindrome */
package Strings;
import java.util.Scanner;

public class Palindrome_not {
    public static boolean isPal(String s){  
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        return isPal(s.substring(1, s.length()-1));
        return false;
    }
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String:");
        String string = scanner.nextLine();
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
        scanner.close();
    }
}