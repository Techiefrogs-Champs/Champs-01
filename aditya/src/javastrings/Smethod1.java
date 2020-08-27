package javastrings;

import java.util.Scanner;

public class Smethod1 {
    public static void main(String []args){
    Scanner obj=new Scanner(System.in);
      System.out.println("enter u r age:");
      System.out.println("enter u r name:");
      String age=obj.nextLine();
     String s=obj.nextLine();
      System.out.println("my age is   "   +age );
      System.out.println("my name is " +s);

    
    //char ch1=str.charAt(3);//for finding index out of bounds of character
    //char ch2=str.charAt(10);//for finding position of character

    //System.out.println("the value at 7th position is =" +ch1);
    //System.out.println("the value at 10th position is =" +ch2);
  }
}