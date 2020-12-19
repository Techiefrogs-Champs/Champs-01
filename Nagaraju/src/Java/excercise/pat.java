//package excercise;

import java.util.Scanner;
class pat {
   public static void main(String[] args) {
       int i,j,r;
       char c;
       Scanner sc = new Scanner(System.in);

do { 
    System.out.println("Enter number of rows:"); 
    while (!sc.hasNextInt()) { 
        System.out.println("That's not a number!"); sc.next(); 
        // this is important! 
    } 
    r = sc.nextInt(); 
} 
while (r <= 0); 
System.out.println("Thank you! Got " + r);

       
       System.out.println("Enter Symbol:");
       c=sc.next().charAt(0);
       for(i=1; i<=r; i++){
           for(j=1; j<=i; j++){
               System.out.print(c);
           }
           System.out.println(" ");
       }  
    }
}