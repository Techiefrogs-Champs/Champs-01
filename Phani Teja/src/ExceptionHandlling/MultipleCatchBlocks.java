package ExceptionHandlling;


public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try{
            int a[]=new int[10];
            a[10]=20/0;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayOutOfBoundsException occurs");
        }
        catch(Exception e){
            System.out.println("ParentException occurs");
        }
        System.out.println("Prints rest of the code");
    }
}