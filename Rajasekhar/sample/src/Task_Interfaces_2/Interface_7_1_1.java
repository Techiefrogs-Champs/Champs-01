/* Q-7).Create an interface with at least one method, in its own package. Create a class in a separate package.
Add a protected inner class that implements the interface.In a third package, inherit from your class and, 
inside a method,return an object of the protected inner class, upcasting to the interface during the return. */


package src.Task_Interfaces_2;
import src.Task_Interfaces_1.Interface_7_1;

public class Interface_7_1_1 extends Interface_7_1{
    void b(){
        Interface_7_2 obj = new Interface_7_2();
        obj.a();
    }
    public static void main(String[] args) {
        Interface_7_1_1 obj1 =new Interface_7_1_1();
        obj1.b();
 }   
}
