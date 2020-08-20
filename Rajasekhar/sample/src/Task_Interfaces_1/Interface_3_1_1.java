/* Q-3).Create an interface containing three methods, in its own package. Implement the interface 
in a different package.Prove that all the methods in an interface are automatically public. */

//implementing Myinterface from package Task_Interfaces

package src.Task_Interfaces_1;

import src.Task_Interfaces.*;

class Electronic_1 implements Interface_3_1 {
    public void mobile(){
        System.out.println("\nThis mobile method is from" +"\npackage: Task_Interfaces and file: Interface_3_1");
    }
    public void laptop(){
        System.out.println("\nThis laptop method is from " +"\npackage: Task_Interfaces file: Interface_3_1");
    }
    public void Telivion(){
        System.out.println("\nThis Telivision method is from " +"\npackage: Task_Interfaces file: Interface_3_1");
    }
    
}
public class Interface_3_1_1{
    public static void main(String[] args) {
        Electronic_1 obj = new Electronic_1();
        obj.mobile();
        obj.laptop();
        obj.Telivion();
    }
}