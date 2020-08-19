/* Write a Java program using inheritance to print the value of Counter.
Create a class Counter with class variable 'i' and method called 'increment()'.
Now write a subclass extending Counter class which calls the increment() function and displays 
the following output:
i = 3 */

class Counter{
    int i=3;
    void increment(){
        System.out.println("i="+i);
    }
}
public class Exercise7 extends Counter {
    public static void main(String[] args){
        Exercise7 c=new Exercise7();
        c.increment();
    }  
}