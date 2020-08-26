package exceptionhandling;

public class pro2 {
    public static void main(String args[]){
        int a[]=new int[5];
        int k=50/0;
        try{
            a[6]=5;
            k=50/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds");
        }
        catch(ArithmeticException e){
            System.out.println("it is not divided by zero");

        }
         System.out.println("exception handle");
        }
        
    }
    
