package Interface;

class Counter{
    int i=3;
    void increment(){
        System.out.println("i="+i);
        i++;
        System.out.println("i="+i);

    }
}
public class Interexe7 extends Counter{
    public static void main(String[] args){
        Interexe7 c=new Interexe7();
        c.increment();
    }
}