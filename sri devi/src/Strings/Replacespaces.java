package Strings;

public class Replacespaces {
      public static void main(String[] args) {
          
     String s="r ep l a ci ng     a l l  white spaces";

       System.out.println(s);

      
      s=s.replaceAll("\\s","" );

    System.out.println("after replacing    "+s);
      }
    







}