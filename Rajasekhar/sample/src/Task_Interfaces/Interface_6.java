/* Q-6).Create three interfaces, each with two methods. Inherit a new interface from the three, 
adding a new method. Create a class by implementing the new interface and also inheriting from 
a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. 
In main( ), create an object of your class and pass it to each of the methods.*/


package src.Task_Interfaces;

public class Interface_6 implements Interface_4 {
    public void method(){
        System.out.println("\nimplementation of Interface_4 method");
    }
    public void method_1(){
        System.out.println("\nimplementation of Interface_1 method_1");
    }
    public void method_2(){
        System.out.println("\nimplementation of Interface_1 method_2");
    }
    public void method_3(){
        System.out.println("\nimplementation of Interface_2 method_3");

    }
    public void method_4(){
        System.out.println("\nimplementation of Interface_2 method_4");
    }
    public void method_5(){
        System.out.println("\nimplementation of Interface_3 method_5");
    }
    public void method_6(){
        System.out.println("\nimplementation of Interface_3 method_6");
    }
    public static void main(String[] args) {
        Interface_6 obj = new Interface_6();
        obj.method();
        obj.method_1();
        obj.method_2();
        obj.method_3();
        obj.method_4();
        obj.method_5();
        obj.method_6();
    }    
}
interface Interface_1{
    void method_1();
    void method_2();
}
interface Interface_2{
    void method_3();
    void method_4();
}
interface Interface_3{
    void method_5();
    void method_6();
}
interface Interface_4 extends Interface_1st,Interface_2,Interface_3{
    void method();
}