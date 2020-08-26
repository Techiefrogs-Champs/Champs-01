/* An abstract class has a construtor which prints "This is constructor of abstract class", 
an abstract method named 'a_method' and a non-abstract method which prints 
"This is a normal method of abstract class". A class 'SubClass' inherits the abstract class and 
has a method named 'a_method' which prints "This is abstract method". 
Now create an object of 'SubClass' and call the abstract method and the non-abstract method. 
(Analyse the result) */

package src.Abstraction;

abstract class Constructor{
    Constructor(){
        System.out.println("\nThis is constructor of Abstract Class");
    }
    abstract void a_method();
    
    void method(){
        System.out.println("\nThis is normal method of Abstract Class");
    }
}
class Subclass extends Constructor{
    void a_method() {
  System.out.println("\nThis is abstract method");
 }
}
public class Abstract_4{
    public static void main(String[] args){
        Subclass obj_1=new Subclass();
        obj_1.a_method();
        Subclass obj_2=new Subclass();
        obj_2.method();

    }
    
}