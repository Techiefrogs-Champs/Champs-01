package src;

class Test_1 {
    Test_1(){
        System.out.println("parent class constructor");
    }
}
public class Test extends Test_1{
    Test(){
        System.out.println("child class constructor");
    }
    public static void main(String[] args) {
        Test obj = new Test();
    }
}
