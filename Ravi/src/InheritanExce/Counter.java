package src.InheritanExce;

public class Counter {
   public  int i=3;
    void increment(){
        i++;
    }
    public static void main(String args[])
    {
        Counter obj=new Counter();
        obj.increment();
        System.out.println(obj.i);
    }
    
}