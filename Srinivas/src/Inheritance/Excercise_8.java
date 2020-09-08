package Inheritance;
class A{
    int i,j;
    A(){
        i=5;
        j=9;
    }
    void show(){
        System.out.println(" the values of i and j"+i +j);
    }
}
class B extends A{
    int k;
    B(){
        k=10;
    }
    void show(){
        System.out.println(" the value of k="+k);

    }
}

public class Excercise_8 {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        b.show();
    }
    
}