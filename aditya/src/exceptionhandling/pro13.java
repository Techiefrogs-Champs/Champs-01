package exceptionhandling;

public class pro13 {
    public static void main(String args[]){
       // int i=50;
        //int j=0;
       // int k=i/j;
       
        try{
       int  i=50/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("exception handled");
    }
    
}