package ModifersAndMethods;

class A {  
    int data = 10;

    void msg() {
        System.out.println("Private method");
    }
}

public class Private {
    public static void main(String args[]) {
        A obj = new A();
        System.out.println(obj.data);
        obj.msg();
     }  
    }  
