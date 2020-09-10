/*8.	Java Program to Use Handle the Exception With Overloaded Methods*/
package Exception_1;

public class Overloade_methods {
    
    double method(int i) throws Exception {
        return i/0;
     }
     boolean method(boolean b) {
        return !b;
     }
     static double method(int x, double y) throws Exception {
        return x + y ;
     }
     static double method(double x, double y) {
        return x + y - 3;
     }   
     public static void main(String[] args) {
        Overloade_methods mn = new Overloade_methods();
        try {
           System.out.println(method(12, 78.10));
           System.out.println(method(10.0, 90));
           System.out.println(method(12.8, 20.2));
           System.out.println(mn.method(10));
        } catch (Exception ex) {
           System.out.println("exception occoure: "+ ex);
        }
     }
  
}