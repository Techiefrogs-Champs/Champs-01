/*Java Program to Convert a Stack Trace to a String(exceptions)*/
package Strings;
import java.io.PrintWriter;
import java.io.StringWriter;

class PrintStackTrace {

    public static void main(String[] args) {

        try {
            int division = 0 / 0;
        } catch (ArithmeticException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);
        }
    }
}