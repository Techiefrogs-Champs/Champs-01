

import java.util.Scanner;

class Swaping{
   public static void main(String args[]){
      int x, y, t;
     
      Scanner s2 = new Scanner(System.in);
      
      Scanner s1 = new Scanner(System.in);
      System.out.println("Enter two numbers x: ");
      x = s2.nextInt();
      System.out.println("Enter two numbers y: ");
      y = s1.nextInt();
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
     
      t = x;
      x = y;
      y = t;
     
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
   }
}