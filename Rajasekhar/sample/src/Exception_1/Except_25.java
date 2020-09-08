/*25.	Java Program to Use Finally Block for Catching Exceptions*/
package Exception_1;

public class Except_25 {
     
    public static void main(String args[]){  
    try{  
    int data=25/0;  
    System.out.println(data);  
    }  
    catch(ArithmeticException e){System.out.println(e);}  
    finally{System.out.println("finally block is always executed");}  
    System.out.println("rest of the code...");  
    }  
}