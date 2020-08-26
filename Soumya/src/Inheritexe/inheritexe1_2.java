package Inheritexe;

 class Parent {
    void mot(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    void boy(){
        System.out.println("This is child class");
    }
}
class inheritexe1_2{
    public static void main(String[] args) {
        Parent m=new Child();
        Parent p= new Parent();
        Child c=new Child();
        p.mot();
        m.mot();
        c.boy();
        
    }
}