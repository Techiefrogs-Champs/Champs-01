/* A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'. 
Its subclass also has an integer data member 'j' and a method named 'printNum' to print the value of 'j'. 
Make an object of the subclass and use it to assign a value to 'i' and to 'j'. 
Now call the method 'printNum' by this object. */

package Task_Methods;

public class Method_7 extends A {
    int j;
    public void printNum(){
        System.out.println(j);
    }
    public static void main(String[] args) {
        Method_7 obj  = new Method_7();
        obj.i=888;
        obj.j=999;
        obj.printNum();
    }
}
class A{
    int i;
    public void printNum(){
        System.out.println(i);
    }
}