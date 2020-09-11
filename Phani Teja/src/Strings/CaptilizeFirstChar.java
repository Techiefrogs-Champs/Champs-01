package Strings;

import java.util.Scanner;

public class CaptilizeFirstChar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the scentence :");
        String line=in.nextLine();
        String upper_case_line="";   
        Scanner linescan=new Scanner(line);
        while(linescan.hasNext()){
            String word=linescan.next();
            upper_case_line+=Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
        }
        System.out.println(upper_case_line.trim());
        
     }
}