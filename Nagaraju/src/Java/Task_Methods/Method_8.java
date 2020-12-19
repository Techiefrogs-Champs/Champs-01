/* Suppose a class 'A' has a static method to print "Parent". 
Its subclass 'B' also has a static method with the same name to print "Child". 
Now call this method by the objects of the two classes. 
Also, call this method by an object of the parent class refering to the child class
 i.e. A obj = new B() */

package Task_Methods;

public class Method_8 {
    public static void okay(){
        System.out.println("Child");
    }
    public static void main(String[] args) {
        A obj = new Method_8(); // we cannot convert from Method_8 to - "compilation error"
        obj.okay();
        obj.okay();

    }
    
}
class A{
    public static void okay(){
        System.out.println("Parent");
    }
}