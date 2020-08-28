import Java.lang.reflect.Method; 
package Inheritance;
class Parent{
    private void display(){
        System.out.println("This is parent class");

    }
}
public class Excercise_2 extends Parent {
    void show(){
        System.out.println("This is child class");

    }
    public static void main(String[] args){
    Parent p=new Parent();
    Excercise_2 e= new Excercise_2();
    Method m=Parent.class.getDeclaredMethod("display");
    m.setAccessible(true);
    m.invoke(p); 
    p.display();
    e.show();
    } 
}