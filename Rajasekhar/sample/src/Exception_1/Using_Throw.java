/* 3.	Java Program to Handle Exception Using Throw KeyWord */
package Exception_1;

public class Using_Throw {

        static void validate(int age){  
          if(age<18)  
           throw new ArithmeticException("not valid");  
          else  
           System.out.println("welcome to vote");  
        }  
        public static void main(String args[]){  
           validate(24);  
           System.out.println("rest of the code...");  
       }  
    
    
}