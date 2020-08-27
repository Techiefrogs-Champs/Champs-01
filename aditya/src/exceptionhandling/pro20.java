package exceptionhandling;

public class pro20 {

    public static void main(String []args){
        String s="abs";
        try{
        int i=Integer.parseInt(s);
         }
         catch(NumberFormatException e){

          System.out.println(e);
    }
    System.out.println("number format exception");
    }
}