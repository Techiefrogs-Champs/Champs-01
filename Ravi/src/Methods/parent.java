

class A{
    public  void staticmethod(){
        System.out.println("Parent");
    }
}
class B extends A{
    public  void staticmethod(){
        System.out.println("Child");
    }
}

public class parent {
    public static void main(String args[]) {
        A obj1 = new A();
        obj1.staticmethod();
        A obj2 = new B();
        obj2.staticmethod();
       
       

    }
}