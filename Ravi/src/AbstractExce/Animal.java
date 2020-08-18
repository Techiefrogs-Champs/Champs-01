package src.AbstractExce;

abstract class Animals{
  
    abstract void sound();
    // abstract void cats();
    // abstract void dogs();

}
class Cats extends Animals{
    void sound(){
        System.out.println("Cats meow");
    }
    // void cats(){
    //     System.out.println("Cats meow");
    // }
    // void dogs(){
    //     System.out.println("Dogs bark");
    // }
    

}
class Dogs extends Animals{
    void sound(){
        System.out.println("Dogs bark");
    }
    // void cats(){
    //     System.out.println("Cats meow");
    // }
    // void dogs(){
    //     System.out.println("Dogs bark");
    // }

}
public class Animal {
    public static void main(String args[])
        {
            Cats c=new Cats();
            c.sound();
            Dogs d=new Dogs();
            d.sound();
        
        
        }
    
}