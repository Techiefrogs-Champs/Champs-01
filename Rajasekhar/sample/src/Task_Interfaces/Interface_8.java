/* Q-8). Create an interface with at least one method, and implement that interface 
by defining an inner class 
within a method, which returns a reference to your interface. */


package src.Task_Interfaces;

interface Interface_8_1{
    void m();
}
public class Interface_8 {
    class Interface_8_1_1 implements Interface_8_1{
        public void m(){
            System.out.println("\n implementation of Interface_8_1 in a inner class");
            
        }
    }
    void m1(){
        Interface_8_1_1 obj = new Interface_8_1_1();
        obj.m();
    }
    public static void main(String[] args) {
        Interface_8 obj1 = new Interface_8();
        obj1.m1();
    }
}
