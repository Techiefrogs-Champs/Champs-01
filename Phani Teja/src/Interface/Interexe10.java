package Interface;

class Apple{
    public int n;
    public Apple(){
        n=5;
    }
    void display(){
        System.out.println("Apples="+n);
    }
}
class Banana extends Apple{
    public int no;
    Banana(int b){
        no=b;
    }
    void display(){
        System.out.println("Bananas="+no);
    }
}
public class Interexe10 {
    public static void main(String[] args){
        Apple a=new Apple();
        Banana b=new Banana(21);
        a.display();
        b.display();
    }
}