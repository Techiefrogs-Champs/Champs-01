package javastrings;

public class Smethod2 {//equals and ignoreequals case
    public static void main(String []args){
    String s1="aditya";
    String s2="bottu";
    String s3="Aditya";
    String s4="bottu";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s2.equals(s4));
    System.out.println(s2.equals("hello"));
   }
}