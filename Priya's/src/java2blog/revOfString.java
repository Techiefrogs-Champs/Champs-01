package java2blog;

import java.util.Scanner;

public class revOfString {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to be reversed :");
        str= sc.nextLine();
        for(int i = str.length()- 1; i>=0; --i){
            rev = rev + str.charAt(i);
        }
        System.out.println("the reverse of the given string is :" +rev);
    }
}




