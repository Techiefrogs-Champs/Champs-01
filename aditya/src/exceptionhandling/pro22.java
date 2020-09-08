package exceptionhandling;

public class pro22 {
    public static void main(String args[]){
        int i=10;
        int j=7;
        int k=i+j;
        int a[]=new int[6];
    try{
        k=i+j;
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    try{
        a[8]=7;
    }
    catch( ArrayIndexOutOfBoundsException e){
        System.out.println(e);

    }
    System.out.println("the vailue is " +k);
    }
}
