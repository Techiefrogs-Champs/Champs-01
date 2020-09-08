/*13.	Java Program to Handle Arithmetic Exception*/
package Exception_1;

public class Except_13 {
    public static void main(String[] args) {
        int a=0, b=4 ;
        int c=0;
        try {
            c = b/a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Nothing to worry.\n"
                    + "We are just printing the stack trace.\n"
                    + "ArithmeticException is handled. But take care of the variable \"c\"");
        }
        System.out.println("Value of c : "+c);
    }

    
}