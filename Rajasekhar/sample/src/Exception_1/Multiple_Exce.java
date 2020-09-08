/* 2.	Java Program to Catch Multiple Exception Types */
package Exception_1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiple_Exce { 
  
        public static void main(String[] args) {  
              Scanner obj = new Scanner(System.in); 
              int a,b;    
              a =obj.nextInt() ;
              b =obj.nextInt() ;  
           try{    
               int result = a/b;
           }    
           catch(ArithmeticException e)   {  
                 System.out.println("Arithmetic Exception occurs");  
           }    
           catch(InputMismatchException e)  {  
              System.out.println("InputMismatchException occurs");  
           }    
           catch(Exception e)  {  
              System.out.println("Parent Exception occurs");  
           }             
           System.out.println("result:" + " "+ a/b);  
           obj.close();
        }  
    
}