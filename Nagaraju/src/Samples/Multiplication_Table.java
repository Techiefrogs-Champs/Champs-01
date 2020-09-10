
import java.util.Scanner;

//using For loop

public class Multiplication_Table {
      public static void main(String args[]){
        int num1,num2, x;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter an integer to print it's multiplication table :");
        num1 = n.nextInt();
        System.out.print("Enter an integer to limit multiplication table:");
        num2 = n.nextInt();        
    
        for (x = 1; x <= num2; x++)
          System.out.println(num1 +" * " +x+" = "+(num1*x));
      }
    } 
// Using While loop
/*
public class Multiplication_Table {
    public static void main(String args[]){
      int num1,num2, x;
      Scanner n = new Scanner(System.in);
      System.out.print("Enter an integer to print it's multiplication table :");
      num1 = n.nextInt();
      System.out.print("Enter an integer to limit multiplication table:");
      num2 = n.nextInt();        
        x =1;
      while (x<=num2){
          int mul = num1*x;
        System.out.println(num1 +" * " +x+" = "+(mul));
        x++;
      }
    }
  } */