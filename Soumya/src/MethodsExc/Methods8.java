package MethodsExc;

public class Methods8 {
    static class A {
        public static void fam() {
            System.out.println("Parent");
        }
    }
    static class B{
    public static void fam() {
        System.out.println("Child");
    }
}

    public static void main(String[] args) {
        B p = new B();
        A c = new A();
        p.fam();
        c.fam();
    

    }
    
}
