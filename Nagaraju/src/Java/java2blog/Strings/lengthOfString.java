package Strings;

import java.util.Scanner;

public class lengthOfString {
    public static void main(String args[]){
        String str ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = sc.nextLine();
        System.out.println("length of  string :"+getLengthOfStringWithCharArray(str));
    }
       
    public static int getLengthOfStringWithCharArray(String str){
        int length=0;
        char[] strCharArray=str.toCharArray();
        for(char c:strCharArray){
            length++;
        }
        return length;
    }
}
