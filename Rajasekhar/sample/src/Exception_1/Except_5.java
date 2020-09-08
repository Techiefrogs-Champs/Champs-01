/*5.	Java Program to Pass Arguments While Throwing Checked Exception*/
package Exception_1;

public class Except_5 {
        public static void main (String args[]) { 
           try {
              throw new Exception("throwing an exception");
           } catch (Exception e) {
              System.out.println(e.getMessage());
           }
        
     }
    
}