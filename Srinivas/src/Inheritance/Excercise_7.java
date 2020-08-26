package Inheritance;
class Counter{
    int i=3;
    void increment(){
        System.out.println("i="+i);

    }
}
public class Excercise_7 extends Counter {
    public static void main(String[] args){
        Excercise_7 c=new Excercise_7();
        c.increment();
    }
    
}