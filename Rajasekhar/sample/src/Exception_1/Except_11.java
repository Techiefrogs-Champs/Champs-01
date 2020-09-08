/*11.	Java Program to Handle Multiple Exceptions (Array Out of Bound)*/
package Exception_1;

public class Except_11 {
    
    public static void main (String args[]) {
        int array[] = {25,30,80};
        int n1 = 15, n2 = 10;
        int result = 10;
        try {
           result = n1/n2;
           System.out.println("The result is" +result);
           for(int i = 5; i >= 0; i--) {
              System.out.println("The value of array is" +array[i]);
           }
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Array is out of Bounds"+e);
        } catch (ArithmeticException e) {
           System.out.println ("Can't divide by Zero"+e);
        }
     }
  
}