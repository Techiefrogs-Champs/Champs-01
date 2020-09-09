package excercise;

import java.util.Scanner;

public class Palindrome {

    static int validate() {
        Scanner sc = new Scanner(System.in); 
        int number;

    do { 
        while (!sc.hasNextInt()) {
            String input = sc.next();
            
            System.out.println("That's not a number!");  
        } 
        number = sc.nextInt(); 
    } 
    while (number <= 0); 
    return number;
    
}
public static void main(String[] args) {
    int number;
          int check, rem, sum = 0;
          System.out.println("Enter the number :");
number= validate();
          check = number;
          while(check != 0) {
             rem = check % 10;
             sum = sum + (rem * rem * rem);
             check = check / 10;
          }
          if(sum == number)
             System.out.println("Given number is an armstrong number.");
          else
             System.out.println("Given number is not an armstrong number.");
       }
}


