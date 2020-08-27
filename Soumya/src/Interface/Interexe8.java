package Interface;

class A{
    int i,j;
        A()
        {
            i=5;
            j=9;
        }
        void diaplay(){
            System.out.println("i and j"+i +j);
        }
}
class B extends A{
    int k;
    B(){
        k=10;
    }
    void show(){
        System.out.println("k="+k);
    }
}
public class Interexe8 {
    public static void main(String[] args){
        B b=new B();
        b.show();
    }
}