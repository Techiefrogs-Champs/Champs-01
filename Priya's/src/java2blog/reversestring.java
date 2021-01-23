package java2blog;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        String wrd, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        wrd = sc.nextLine();
        int length = wrd.length();
        for(int i = length-1; i>=0; i--){
            rev = rev+wrd.charAt(i);
        }
        System.out.println("Reverse of string is: "+rev);  
    }
}
