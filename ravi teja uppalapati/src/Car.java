 class Motor {
    private int i=8;
    void display(){
        System.out.println("max speed ="+i);
    }}
    public class Car extends Motor{
        void sound(){System.out.println("sound");}
    
public static void main(String[] args){
    Car obj=new Car();
    System.out.println();
    obj.sound();
    obj.display();


    }
}