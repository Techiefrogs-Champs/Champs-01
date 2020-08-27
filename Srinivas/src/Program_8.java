abstract class A{
    public static void m(){
        System.out.println("Parent");
    }
}

public class Program_8 {
    public static void okay(){
        System.out.println("Child");
    }
    public static void main(String[] args) {
        A obj = new Program_8(); // we cannot convert from program_8 to - "compilation error"
        obj.m();
        obj.m();

    }
    
}
