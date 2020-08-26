/* Q-7).Create an interface with at least one method, in its own package. Create a class in a separate package.
Add a protected inner class that implements the interface.In a third package, inherit from your class and, 
inside a method,return an object of the protected inner class, upcasting to the interface during the return. */


package src.Task_Interfaces_1;
import src.Task_Interfaces.*;

public class Interface_7_1 {
    protected class Interface_7_2 implements Interface_7{
        public Interface_7_2(){

        }
        public void a(){
            System.out.println("\nimplementation of method: a() from pakage: Task_Interfaces and file: Interface_7");
        }
    }
    
}