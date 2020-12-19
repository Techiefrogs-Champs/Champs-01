//package excercise;
package excercise;
import java.util.Scanner;
class Pat2 {
   public static void main(String[] args) {
       int i,j,r=1;
       Scanner sc = new Scanner(System.in);

do { 
    System.out.println("Enter number of rows:"); 
    while (!sc.hasNextInt()) { 
        System.out.println("That's not a number!"); 
        sc.next(); 
        // this is important! 
    } 
    r = sc.nextInt(); 
} 
while (r <= 0); 
System.out.println("Thank you! Got " + r);

       for(i=1; i<=r; i++){
           for(j=1; j<=i; j++){
               System.out.print(r);
           }
           System.out.println(" ");
       }  
    }
}
