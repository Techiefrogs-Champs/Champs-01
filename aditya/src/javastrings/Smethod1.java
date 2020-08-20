package javastrings;

public class Smethod1 {
    public static void main(String []args){
    String str= "ragu  g ar u   ";
   
    char ch1=str.charAt(3);//for finding index out of bounds of character
    char ch2=str.charAt(10);//for finding position of character

    System.out.println("the value at 7th position is =" +ch1);
    System.out.println("the value at 10th position is =" +ch2);
  }
}