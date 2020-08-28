package exceptionhandling;

public class pro14 {
    public static void main(String args[]){
        int a[]=new int[7];
    
    
    try 
        {
         a[9]=6;
        }
     catch (ArrayIndexOutOfBoundsException e) {
         System.out.println(e);
        
        }
      System.out.println("exception handled");
     
    }
}