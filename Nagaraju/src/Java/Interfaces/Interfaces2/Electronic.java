/* Q-3).Create an interface containing three methods, in its own package. Implement the interface 
in a different package.Prove that all the methods in an interface are automatically public. */

//implementing Myinterface from package Task_Interfaces
import Interfaces;

class Electronic_1 implements Myinterface {
    public void mobile(){
        System.out.println("\nThis mobile method is from" +"\npackage: Task_Interfaces and file: Myinterface");
    }
    public void laptop(){
        System.out.println("\nThis laptop method is from " +"\npackage: Task_Interfaces file: Myinterface");
    }
    public void Telivion(){
        System.out.println("\nThis Telivision method is from " +"\npackage: Task_Interfaces.Myinterface");
    }
    
}
public class Electronic{
    public static void main(String[] args) {
        Electronic_1 obj = new Electronic_1();
        obj.mobile();
        obj.laptop();
        obj.Telivion();
    }
}