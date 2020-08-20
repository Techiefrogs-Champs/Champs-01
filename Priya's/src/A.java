class A {
    static void disp(){
        System.out.println("PARENT");
    }
}

class B extends A{
    static void disp(){
        System.out.println("CHILD");
    }

    public static void main(String[] args) {
        
        A.disp();
        
        B.disp();

        
    }
}