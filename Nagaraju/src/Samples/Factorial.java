

import java.util.Scanner;
///Using For loop
public class Factorial {

    public static void main(String[] args) {

        int num ;
        long fact = 1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        num = obj.nextInt(); 
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
} 
//using while loop
/*
public class Factorial {

    public static void main(String[] args) {

    	//We will find the factorial of this number
        int num ;
        long fact = 1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        num = obj.nextInt(); 
        int i = 1;
        while(i<=num)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
} */

// Using Recursion
/*
public class Factorial {
    static int factorial(int n) { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 
        public static void main(String[] args) { 
        int num ;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        num = obj.nextInt(); 
        System.out.println("Factorial of "+ num + " is " + factorial(num)); 
    } 
} */