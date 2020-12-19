/* Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". 
It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name 
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. 
Call the method by creating an object of each of the three classes. */

package Task_Methods;

class Degree {
    public void getDegree() {
         System.out.println("I got a degree");
    }
}
class Undergraduate{
    public void graduate(){
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate{
    public void graduate(){
        System.out.println("I am a Postgraduate");
    }
}
public class Method_5{
    public static void main(String[] args) {
        Degree obj1 = new Degree();
        obj1.getDegree();  
        Undergraduate obj2 =new Undergraduate();
        obj2.graduate();
        Postgraduate obj3 = new Postgraduate();
        obj3.graduate();
    }
}
