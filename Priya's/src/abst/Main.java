package abst;



abstract class Main {
    Main() {
        System.out.println("THIS IS A CONSTRUCTOR OF ABSTRACT CLASS");
    }
    abstract void a_method();
    void method(){
        System.out.println("THIS IS NORMAL METHOD OF ABSTRACT");
    }
}

class Subclass extends Main{
    void a_method(){
        System.out.println("THIS IS ABSTRACT METHOD");
    }
}

class Result{
    public static void main(String[] args) {
        Main m = new Subclass();
        m.a_method();

    }
}