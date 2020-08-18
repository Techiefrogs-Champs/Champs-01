package src.AbstractExce;

abstract class abstractconstru1 {
    abstractconstru1(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();

    public void nonabstractmethod () { //non-abstract method
        System.out.println("This is a normal method of abstract class");
    }
    
}

class a extends abstractconstru1{
    void a_method(){
        System.out.println("This is abstract method");
    }
}
public class abstractconstru{
    public static void main(String args[])
    {
       a obj=new a();
       obj.a_method();
       obj.nonabstractmethod();
    }
}