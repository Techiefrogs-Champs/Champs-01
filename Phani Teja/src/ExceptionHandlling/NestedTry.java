package ExceptionHandlling;

public class NestedTry {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("going to drive");
                int a=35/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int b[]=new int[5];
                b[5]=4;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("handled");
        }catch(Exception e){
            System.out.println("run remaining code");
        }

    }
}